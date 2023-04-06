import java.awt.Color

fun main()  {

    /* -------------------------------------------------- */
    /*                   CONTROL FLOE                     */
    /* -------------------------------------------------- */

    // ENUMURATION

    val color = colors.BLUE
    print( color )

    println()
    println()

    val number : Array<numbers> = numbers.values()
    number.forEach { numbers ->
        print("${numbers} ")
    }

    println()
    println()

    /* -------------------------------------------------- */

    // EXPRESSION AND STATEMENT

    val officeOpen = 07.00
    val now = 07.30

    val today = if (now >= officeOpen) "Office Is Open" else "closed" // disini if berpresan sebagai expression
    println(today)

    if ( now >= officeOpen){       // disini if berperean sebagai statement
        print("Office Is Open")
    }else{
        print("closed")
    }

    // EXPRESSION = MENGEMBALIKAN NILAI
    // STATEMENT = TIDAK MENGEMBALIKAN NILAI


    println()
    println()

    /* -------------------------------------------------- */

    // WHEN EXPRESSION

    val price = 700

    when(price){
        701 -> println("Tujuh ratus seribu")
        700 -> println("Tujuh ratus ribu")
        702 -> println("Tujuh ratus duaribu")
        else -> println("Tidak ada data yang cocok")
    }


    println()
    println()

    /* -------------------------------------------------- */

    // WHILE DAN DOWHILW

    var counter = 1
    while (counter <=3){
        println("Hello While")
        counter++
    }

    println()

    var secondCounter = 1
    do {
        println("Hello Do While")
        secondCounter++
    } while (secondCounter <=3)

    println()
    println()

    /* -------------------------------------------------- */

    // RANGE

    var numberRange = 1..10
    println(numberRange.step)



    var secondRange = 1..10 step 2
    secondRange.forEach {
        print("$it")
    }

    println(secondRange.step)


    println()
    println()

    /* -------------------------------------------------- */

    // FOR LOOP

    var forNumber = 1..5
    for (i in forNumber){
        println("The Number is $i")
    }

    println()

    var rangeNumbers = 1..10 step 2
    for (i in rangeNumbers){
        println("NUmber - $i")
    }

    println()
    println()

    /* -------------------------------------------------- */

    // BREAK DAN CONTINUE

    var argumentNumber = listOf(1, 2, null, 3, 5, 6, 7, 8, null)

    for (i in argumentNumber){
        if (i == null) continue
        print(i)
    }

    println()

    for (i in argumentNumber){
        if (i == null) break
        print(i)
    }


}



enum class colors(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0XF555A)

}

enum class numbers(val value: Int){
    firstNumber(1),
    SecondNumber(2),
    thirNumber(3)
}