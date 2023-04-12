import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/* -------------------------------------------------- */
/*                     COROUTINES                     */
/* -------------------------------------------------- */

// Corountines (dapat menjalankan beberapa aksi dalam satu waktu)

fun main () = runBlocking {
    launch {
        delay(1000L)
        println("Kotlin Corountines")
    }
    println("Hello")
    delay(2000L)
}