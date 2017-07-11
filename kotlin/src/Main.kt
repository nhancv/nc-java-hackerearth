/**
 * Created by nhancao on 7/7/17.
 */

fun main(args: Array<String>) {
    val n: Int = readLine()!!.toInt()
    val s: String = readLine()!!

    var counth = 0 //x2
    var counta = 0 //x2
    var countc = 0
    var countk = 0
    var counte = 0 //x2
    var countr = 0 //x2
    var countt = 0

    for (i in 0..s.length - 1) {
        if (s[i] == 'h') counth++
        if (s[i] == 'a') counta++
        if (s[i] == 'c') countc++
        if (s[i] == 'k') countk++
        if (s[i] == 'e') counte++
        if (s[i] == 'r') countr++
        if (s[i] == 't') countt++
    }

    counth /= 2
    counta /= 2
    counte /= 2
    countr /= 2

    var min = minOf(countr, countt, minOf(countk, counte, minOf(counth, counta, countc)))
    println(min)


}
