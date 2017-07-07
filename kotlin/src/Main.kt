/**
 * Created by nhancao on 7/7/17.
 */

fun main(args: Array<String>) {
    val n: Int = readLine()!!.toInt()
    val inputArr = Array(n, { i: Int -> i })
    for (i in 0..n - 1) {
        inputArr[i] = readLine()!!.toInt()
    }

    for (item in inputArr.reversedArray())
        println(item)

}
