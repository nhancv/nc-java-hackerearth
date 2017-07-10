/**
 * Created by nhancao on 7/7/17.
 */

fun queen(b: Array<Array<Int>>) {

    for (i in 0..b.size - 1) {
        for (j in 0..b[i].size - 1) {
            println("${i} ${j} ${b[i][j]}")
        }
    }

}

fun main(args: Array<String>) {
//    val n: Int = readLine()!!.toInt()
//
//    val inputArr = IntArray(n)
//    for (i in 0..n - 1) {
//        inputArr[i] = readLine()!!.toInt()
//    }

    val arr = Array(11, { Array(11, { 0 }) })
    for (i in 0..arr.size - 1) {
        for (j in 0..arr[i].size - 1) {
//            arr[i][j] = (i + j)
        }
    }
    queen(arr)


}
