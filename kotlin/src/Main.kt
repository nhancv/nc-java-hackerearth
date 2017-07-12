/**
 * Created by nhancao on 7/7/17.
 */

fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(" ")

    val arr = Array(n.toInt(), { Array(m.toInt(), { 0 }) })

    for (i in 0..n.toInt() - 1) {
        val tmp = readLine()!!.split(" ")
        for (j in 0..m.toInt() - 1) {
            arr[i][j] = tmp[j].toInt()
        }
    }

    for (i in 0..m.toInt() - 1) {
        var s = ""
        for (j in 0..n.toInt() - 1) {
            s += (arr[j][i].toString() + " ")
        }
        println(s)
    }

}
