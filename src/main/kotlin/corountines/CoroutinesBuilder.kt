package corountines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis


suspend fun getCapital(): Int {
    delay(1000L)
    return 50000
}


suspend fun getIncome(): Int{
    delay(1000L)
    return 75000
}

/* Contoh pertama
fun main() = runBlocking {
    var capital =  async { getCapital() }
    var income = async { getIncome() }

    println("Your profif is ${income.await() - capital.await()}")
}
*/


// CONTOH KEDUA

fun main() = runBlocking {

    val timeOne = measureTimeMillis {
        val capital = getCapital()
        val income = getIncome()

        println("Your profit is ${income - capital} with sequensial")
    }

    val timeTwo = measureTimeMillis {
        val capital = async { getCapital() }
        val income = async { getIncome() }

        println("Your profit is ${income.await() - capital.await()} with asyn")
    }

    println("complated with ${timeOne} vs ${timeTwo}")
}


