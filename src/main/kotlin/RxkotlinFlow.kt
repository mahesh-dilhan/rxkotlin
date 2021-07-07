import io.reactivex.rxjava3.kotlin.subscribeBy
import io.reactivex.rxjava3.kotlin.toObservable

fun main() {

    val list = listOf("US", "SG", "IND", "PK", "AUS")

    list.toObservable() // extension function for Iterables
        .filter { it.length >= 5 }
        .subscribeBy(  // named arguments for lambda Subscribers
            onNext = { println(it) },
            onError =  { it.printStackTrace() },
            onComplete = { println("Done!") }
        )

}
