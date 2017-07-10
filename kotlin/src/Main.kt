/**
 * Created by nhancao on 7/7/17.
 */

fun isAttacked(x: Int, y: Int, board: Array<Array<Int>>, n: Int): Boolean {
    for (i in 0..n - 1) {
        if (board[x][i] == 1) {
            println("x $i $x $n attacked ")
            return true
        }
    }
    for (i in 0..n - 1) {
        if (board[i][y] == 1) {
            println("y $i $y $n attacked ")
            return true
        }
    }

    for (i in 0..n - 1 - y) {
        if (board[i][y + i] == 1) return true
    }
    for (i in 0..y) {
        if (board[i][y - i] == 1) return true
    }
    return false

}

fun queen(board: Array<Array<Int>>, n: Int): Boolean {
    if (n < 0) return true

    for (i in 0..n - 1) {
        for (j in 0..n - 1) {
            if (isAttacked(i, j, board, n)) {
                println("$i $j attacked $n")
                continue
            } else {
                println("$i $j continue $n")

                board[i][j] = 1
                if (queen(board, n - 1)) {
                    println("$i $j queen ${n - 1}")
                    return true
                }

                board[i][j] = 0
                println("$i $j reset $n")

                for (r in 0..n - 1) {
                    for (c in 0..n - 1) {
                        print("${board[r][c]} ")
                    }
                    println()
                }
            }
        }
    }
    return false
}

fun main(args: Array<String>) {
//    val n: Int = readLine()!!.toInt()
//
//    val arr = Array(n, { Array(n, { 0 }) })
//
//    println(queen(arr, n))
//
//    for (i in 0..n - 1) {
//        val s: StringBuilder = StringBuilder()
//        for (j in 0..n - 1) {
//            s.append("${arr[i][j]} ")
//        }
//        println(s)
//    }

    val (l, r, k) = readLine()!!.split(' ')
    var count: Int = 0
    for (i in l.toInt()..r.toInt()) {
        if (i % k.toInt() == 0) {
            count++
        }
    }
    println(count)


}
