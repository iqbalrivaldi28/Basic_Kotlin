
fun main(){

    /* -------------------------------------------------- */
    /*               Dasar Fundamental Kotlin             */
    /* -------------------------------------------------- */

    /*
   // Dasar 1
    val name = "Iqbal"
    var age = 20
    age++

    println("Hello my name is ${name}")
    print("My age is ${age}")


    val firstWord = "Hello "
    var secondWord = "Sarah"
    secondWord = "Andy"

    print( firstWord + secondWord)
     */


    /* -------------------------------------------------- */

    /*
    // Char
    val firstWord = 'A'
    var secondWord = "Saya Mendapatkan Nilai"

    print("${secondWord} " + firstWord)
     */

    /* -------------------------------------------------- */
    // STRING

    // Indexing
    val text = "Kotlin"
    val firstChar = text[0]

    println("Huruf pertama dari kata kotlin adalah huruf $firstChar")

    println()

    // Iterasi String dengan forloop
    var mainText = "KOTLIN"

    for (char in mainText){
        print("${char} ")
    }

    println()
    println()

    // Escaped String
    var secondText = "Kotlin is \"awasome!\"\nand I Love It \t Let's Start The Journey! "

    print(secondText)

    println()
    println()

    // Raw String
    var line = """
        Line Fisrt
        Line Second
        Line Third
        Line Fourth
    """.trimIndent()

    print(line)

    println()
    println()


    /* -------------------------------------------------- */

    // FUNCTION Pada Kotlin

    val yourName = setUser("Boy", "Wiliam")
    print(yourName)

    println()
    println()

    val yourColor = isColor("Green","White", 1101)
    print(yourColor)

    println()
    println()

    val additionNumber = isNumber(1, 6)
    print(additionNumber)


    println()
    println()

    /* -------------------------------------------------- */
    // IF EXPRESSION


    val price = 40
    val item = 2

    val count = price * item
    println("Your total prices is ${count}")

    if (count >= 100){
        println("You get a discount")
        print("Total = ${count - 30}")
    } else {
       println( "You don't get the discount. Disc(>=100)")
       print("Becaoue you total prices is ${count}")
    }


    println()
    println()

    /* -------------------------------------------------- */
    // BOOLEAN

    val jam = 07.00
    val open = 07.30
    val closed = 15.00

    if (jam >= open || jam <= closed){
        print("The Store is Open!")
    } else {
        print("The Store is Closed")
    }


    println()
    println()

    /* -------------------------------------------------- */
    // NUMBER

    // String to Integer
    val stringNumber = "122"
    val number = 78

    val countNumbers = stringNumber.toInt() + number
    println(countNumbers)

    // Integer to String
    val integerToString = stringNumber + number.toString()
    println(integerToString)

    println()


    // String Terminal Apss Bio Programmer

    /*
    println("--------------------------------------")
    println(" Selamat Datang Di Program Biodata Apps ")
    println(" Silahkah Masukan Identitas Anda ")
    println("--------------------------------------")

    print("Nama Lengkap: ")
    var namaLengkap = readLine()
    print("Usia: ")
    var usia = readln()
    print("Jenis Kelamin: ")
    var jk = readLine()


    var bio = """
        +---------------------------------+
        + Biodata Programmer 
        +---------------------------------+
        Nama Lengkap: $namaLengkap
        Usia Anda   : $usia
        Jenis Kelamin : $jk
        +---------------------------------+
    """.trimIndent()

    print(bio)
    */


    /* -------------------------------------------------- */
    // ARRAY

    val valueArray = arrayOf("Aku", 20, 21.00)

    // Ubah isi array
    valueArray[0] = "Aku Suka Kamu"

    print(valueArray[0])


    /* -------------------------------------------------- */
    // NULL (SAFE CALLS & ELVIS OPERATOR)


    val nullText: String? = null

    // Penggunaan Safe Call pada null lable
    val textLengthSafe: String? = null
    textLengthSafe?.length  // Safe call operator

    // Penggunaan Elvis Operator
    val textLengthElvis: String? = null
    var textElvis = textLengthElvis?.length ?: "Ini nilai Deafaultnya"  // Elvis Operator

    /* Operator elvis diatas juga sama ketika kita menggunakan IF/ELSE berikut */

    var textElvisKayakIf = if (textLengthElvis != null) textLengthElvis.length else "Niali Default" // Elvis Versi If
}


    // EXTERNAL FUNSTION DI MENU MAIN

    // Funtion Pada Kotlin
    fun setUser (firstName: String, lastName: String) {
       print("Your firstname is ${firstName} and your lastname is ${lastName}")
    }

    fun isColor (firstColor: String, lastColor: String, codeColor: Int): String{
        return "Your first color is $firstColor, and than last color is $lastColor, the code of color is $codeColor"
    }

    fun isNumber (firstNumber: Int, secondNumber: Int){
        println(firstNumber + secondNumber)
    }

