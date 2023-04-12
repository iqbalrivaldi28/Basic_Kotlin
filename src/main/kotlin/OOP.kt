
/* -------------------------------------------------- */
/*         OBJECT ORIENTED PROGRAMMING (OOP)          */
/* -------------------------------------------------- */


// CLASS
class animal(var name: String, var weight: Double, var age: Int, var isMamamal: Boolean){

    fun eat(){
        println("$name sedang makan")
    }

    fun sleep(){
        println("$name sedang tidur")
    }

}


// Properties (Penggunaan Setter dan Getter)
class mobil{
    var name: String = "Toyota Fortuner"

        get() {
            println("Fungsi Getter Terpanggil")
            return field
        }

        set(value) {
            println("Fungsi Setter Terpanggil")
            field = value
        }
}


/* -------------------------------------------------- */
// Extentions Properties  (kita mengextends properties(parameter) dari suatu kelas tanpa mewarisi kelasnya

class AnimalTwo (var name: String, var weight: Double, var age: Int, var isMamal: Boolean)

val AnimalTwo.getAnimalInfo: String
get() = "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age}, Malalia: ${this.isMamal}"



/* -------------------------------------------------- */

fun main() {

    // OBJECT (kita inisialisasi kelasnya kedala object)
    var objectAnimal = animal("Bolt", 4.2, 3, true)
    // println("Nama hewan ${objectAnimal.name}, Berat hewan ${objectAnimal.weight}, Umur hewan ${objectAnimal.age}, Jenis mamalia? ${objectAnimal.isMamamal}" )

    println("""
        Nama hewan  : ${objectAnimal.name},
        Berat hewan : ${objectAnimal.weight},
        Umur hewan  : ${objectAnimal.age},
        Mamalia     : ${objectAnimal.isMamamal}
    """.trimIndent())

    println()

    objectAnimal.eat()
    objectAnimal.sleep()

    println()
    println()


    // Properties (Penggunaan Setter dan Getter)
    var objectMobil = mobil()
    println("Nama Mobil ${objectMobil.name}")
    objectMobil.name = "Mitsubishi Expander"
    println("Nama Mobil Sekarang ${objectMobil.name}")


    println()
    println()


    // Extentions Properties
    val dicodingCat = AnimalTwo("Bolt",3.4, 2, true)
    println(dicodingCat.getAnimalInfo)

}





