/**
 * Created by nhancao on 7/7/17.
 */

fun isAttacked(x: Int, y: Int, board: Array<Array<Int>>): Boolean {
    for (i in 0..board.size - 1) {
        if (board[x][i] == 1) return true
    }

    for (i in 0..board.size - 1) {
        if (board[i][y] == 1) return true
    }

    for (i in maxOf(x, y) downTo 0) {
        if (x - i >= 0 && y - i >= 0 && board[x - i][y - i] == 1) return true
        if (x - i >= 0 && y + i < board.size && board[x - i][y + i] == 1) return true
        if (x + i < board.size && y + i < board.size && board[x + i][y + i] == 1) return true
        if (x + i < board.size && y - i >= 0 && board[x + i][y - i] == 1) return true
    }

    for (i in 0..board.size - 1 - minOf(x, y)) {
        if (x - i >= 0 && y - i >= 0 && board[x - i][y - i] == 1) return true
        if (x - i >= 0 && y + i < board.size && board[x - i][y + i] == 1) return true
        if (x + i < board.size && y + i < board.size && board[x + i][y + i] == 1) return true
        if (x + i < board.size && y - i >= 0 && board[x + i][y - i] == 1) return true
    }

    return false

}

fun queen(board: Array<Array<Int>>, n: Int): Boolean {
    if (n == 0) return true

    for (i in 0..board.size - 1) {
        for (j in 0..board.size - 1) {
            if (isAttacked(i, j, board)) continue
            board[i][j] = 1
            if (queen(board, n - 1)) return true
            board[i][j] = 0
        }
    }
    return false
}

fun main(args: Array<String>) {
    val n: Int = readLine()!!.toInt()

    val arr = Array(n, { Array(n, { 0 }) })

    if (queen(arr, n)) {
        println("YES")
        for (i in 0..n - 1) {
            val s: StringBuilder = StringBuilder()
            for (j in 0..n - 1) {
                s.append("${arr[i][j]} ")
            }
            println(s)
        }
    } else println("NO")


}
