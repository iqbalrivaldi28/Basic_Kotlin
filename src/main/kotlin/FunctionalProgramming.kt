import jdk.nashorn.internal.objects.NativeArray.filter
import org.omg.CORBA.Current
import java.lang.IllegalArgumentException
import java.util.Locale.filter

/* -------------------------------------------------- */
/*         KOTLIN FUNCTIONAL PROGRAMMING              */
/* -------------------------------------------------- */

fun main() {

    // Name function
    val userOne = getFullName("Cakra","Putra", "Dewa")
    println(userOne)


    // Default argument function
    val userTwo = getFullNameUserTwo()
    println(userTwo)


    // Variabel Argument
    val varagNummber = varagArgument(1, 2, 3, 4, 5, 6, 7)
    println(varagNummber)

    // Extention Function
    val extentionFunction = "Angga"
    println(extentionFunction.nameUser())

    val extentionNumber = 10
    println(extentionNumber.numberSum())

    // Lambda
    message() // bisa langsung di panggil

    val messgLamb = message() // atau di tampung ke variabel
    println(messgLamb)

    message2("This is lambda with parameter")


    // High-order Function
    printResult(5, sum)   // parameter pertama nilai dan parameter kedua kita panggil lambda


    // Function Reference
    val numberFunction = 1 .rangeTo(10)
    val evenNumbers = numberFunction.filter(::isEvenNumber)
    println(evenNumbers)

    println()


    /* -------------------------------------------------- */

// Fold(), Drop() dan Take()

// Fold() untuk melakukan perhitungan nilai yang ada di dalam collection tapa iterasi pada masing" item
    val numberFold = listOf(1,2,3,4)
    val fold = numberFold.fold(10){ current, item ->
        println("Current $current")
        println("item $item")
        println()
        current + item
    }

    println("Fold is $fold")

    println()

    // Drop() untuk memangkas beberapa urutan list yang ada dalam collection

    val numberDrop = listOf(1,2,3,4,5,6,7,8,9,10)
    val drop = numberDrop.drop(2)
    val dropLast = numberDrop.dropLast(3)

    println(drop)
    println(dropLast)

    println()


    // Take() untuk menyaring/mengambil nilai list yang ada didalam collection

    val numberTake = listOf(1,2,3,4,5,6,7,8,9,10)
    val take = numberTake.take(7)
    val takeLast = numberTake.takeLast(7)

    println(take)
    println(takeLast)

    println()


    // Slice() untuk menyaring/mengambil nilai list yang ada didalam collection dengan posisi tertentu

    val numberSlice = listOf(1,2,3,4,5,6,7,8,9,10)
    val slice = numberSlice.slice(5..9)  // 5 = index awal  9 = index akhir yang mau di abil

    println(slice)
    println()

    // Distinct() untuk menyaring item yang sama

    val numberDistinct = listOf(1,2,3,4,5,6,7,1,2,3,4,5,)
    val distinct = numberDistinct.distinct()

    println(distinct)
    println()

    // distinc dengan data class

    data class Item(val key: Int, val value: String)

    val itemList = listOf(
        Item(1, "Kotlin"),
        Item(2, "Is"),
        Item(3, "Awesome"),
        Item(3, "Language"),
    )

    val distinctItemList = itemList.distinctBy { it.key }
    distinctItemList.forEach {
        println("${it.key} with value ${it.value}")
    }







}







/* -------------------------------------------------- */

// Named and Default Argument in Funcion

// Name function
fun getFullName (first: String, middle: String, last: String): String{
    return "$first, $middle, $last"
}

// Default argument function
fun getFullNameUserTwo (
    first: String = "John",
    middle: String = "Khanedy",    // Default value pada argument
    last: String = "Guntara"
): String{
   return "$first, $middle, $last"
}

/* -------------------------------------------------- */
//Vararg (Variable Argument)

fun varagArgument(vararg number: Int): Int{         // dengan keyword vararg kita bisa bebas memasukan jumlah argument
    return number.sum()
}

/* -------------------------------------------------- */
// Extentions Function

fun String.nameUser(): String {
    return "Hello $this"
}

fun Int.numberSum(): Int{
    return this * 2
}

/* Bisa juga penulisan pake Body Expression */
//  fun Int.numberSuma(): Int = this*2


/* -------------------------------------------------- */

// Lambda
val message= { println("Hello folks, this inis Lambda")}

// Lambda with Return Value
val message2 = { message2: String -> println(message2)}

/* -------------------------------------------------- */

// High-Order Function  (sebuah fungsi yang menggunakan fungsi lain/lambda sebagai parameternya)

fun printResult(value: Int, sum: (Int) -> Int){
    val result = sum(value)
    println(result)
}
// Lambda
val sum : (Int) -> Int = {value -> value + value}


/* -------------------------------------------------- */

// Function Reference

fun isEvenNumber (number: Int) = number % 2 == 0


/* -------------------------------------------------- */

// Function Inside Function

fun sum(valueA: Int, valueB: Int, valueC: Int):Int {
    fun validateNumber(value: Int){
        if (value == 0){
            throw IllegalArgumentException("Value must more than 0")
        }
    }
    validateNumber(valueA)
    validateNumber(valueB)
    validateNumber(valueC)

    return valueA + valueB + valueC
}
















