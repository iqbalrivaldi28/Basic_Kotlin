
    /* -------------------------------------------------- */
    /*         DATA CLASES & COLLECTIONS                  */
    /* -------------------------------------------------- */

    // DATA CLASES

    // class biasa
    class users (val name: String, val age: Int) // harus menambahkan fungsi toString() jika datanya ingin terbaca

    // data class
    data class dataUsers (val name: String, val age: Int){ // data class secara otomatis include fungsi toString()
       fun intro(){
           print("My name is $name, my age is $age. this is Behaviour Example in Data Class")
           println()
       }
    }

    fun main() {

        val user = users("Kane", 30)
        val dataUsers = dataUsers("Son", 31)

        println(user)
        println(dataUsers)

        println()

        /* -------------------------------------------------- */
        // fungsi equals secara otomatis bawaan data class

        val dataOne = dataUsers("Boy", 25)
        val dataTwo = dataUsers("Jane", 23)
        val dataThird = dataUsers("Hamid", 24)

        println(dataOne.equals(dataTwo))
        println(dataOne.equals(dataThird))

        println()

        // Kita bisa mencopy objek dan menodifikasi valuenya

        val dataFourth = dataOne.copy("Alex") // kita copy objek dataOne dan kita modifikasi value bagian nama
        println(dataFourth)

        println()

        /* -------------------------------------------------- */
        // Destructuring Declaration adalah proses memetakan objek menjadi sebuah variabel

        val dataDestructuring = dataUsers("Hilman", 28)

        val name = dataDestructuring.component1() // proses kita memetakan objek jadi variabel
        val age = dataDestructuring.component2()

        println("Hello my name is $name, my age is $age")

        println()

        // Contoh penerapan Behavior
        val dataBehaviour = dataUsers("Ahmad",5)
        dataBehaviour.intro()

        println()



        /* -------------------------------------------------- */
        // COLLECTIONS TIPE LIST    (Bersifat Immutable nilainya tidak bisa diubah)

        var list = listOf<Int>(1, 2, 3, 4,)  // Penerapan list dengan value angka integer
        println(list[1])

        var listNumber = listOf(10, 11, 12) // Kita juga bisa iniasilisasi tanpa memberikan parameter <Int>
        println(listNumber)

        val anyList = listOf("A", "Ini Aku", 9)
        println(anyList)

        val anylistTwo = mutableListOf("True", 12, "A", dataUsers("Kenzo", 12))  // Dengan mutableList kita bisa ubah nilainya
        anylistTwo[1] = 1
        println(anylistTwo)

        println()




        // COLLECTION SET

        val numberSet = setOf(1, 2, 4, "aku", "2", 1, 4)
        println(numberSet)

        val numberSetTwo = mutableSetOf(false, "A", "SAYA SUKA KAMU", 1, 2, 1)  // kalau mutabble kita bisa hapus dan tambah valuenya tetapi tidak bisa ubah nilainya
        numberSetTwo.remove(false)
        numberSetTwo.add("True")
        println(numberSetTwo)

        println()

        val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
        //mutableSet[2] = 6 // tidak bisa mengubah set immutable
        mutableSet.add(6) // menambah item di akhir set
        mutableSet.remove(1) //menghapus item yang memiliki nilai 1



        // MAP -> Key Value

        val capital = mapOf(
            1 to "Number One",       // 1 sebagai key dan valuenya "Number One"
            2 to "Number Two",
            3 to "Number Three"
        )

        println(capital[4])
        println(capital.getValue(2))



        /* -------------------------------------------------- */
        // COLLECTIONS OPERATOR

        // filter

        val numberFilter = listOf(1, 2, 3, 4, 5, 6, 7)

        val evenList = numberFilter.filter { it % 2 == 0 }  // Filter value yang habis di bagi 2
        println(evenList)

        val evenNotList = numberFilter.filterNot { it % 2 == 0 }  // Filter value yang tidak habis di bagi 2
        println(evenNotList)


        // map()

        val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val multipliedBy5 = numberList.map { it * 5 }
        println(multipliedBy5)

        // count()

        val numberListTwo = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        println(numberListTwo.count())

        // find(), firstOrNull(), & lastOrNull()

        val numberListThird = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val firstOddNumber = numberListThird.find { it % 2 == 1 }
        val firstOrNullNumber = numberListThird.firstOrNull { it % 2 == 3 }

        println(firstOddNumber)
        println(firstOrNullNumber)

        // first() & last()

        val numberListFourth = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val moreThan10 = numberListFourth.first { it > 10 }
        print(moreThan10)

        // sum()

        val numberListSix = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val total = numberListSix.sum()
        println(total)

        // sorted()
        val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
        val ascendingSort = kotlinChar.sorted()
        println(ascendingSort)

        val descendingSort = kotlinChar.sortedDescending()
        println(descendingSort)





    }


