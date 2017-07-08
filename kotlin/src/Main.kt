/**
 * Created by nhancao on 7/7/17.
 */

fun main(args: Array<String>) {
    val t: Int = readLine()!!.toInt()
    for (i in 1..t) {
        val n: Int = readLine()!!.toInt()
        val s: String = java.lang.Integer.toBinaryString(n)
        println(s.replace("0", "").length)
    }

}
