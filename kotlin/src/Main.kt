/**
 * Created by nhancao on 7/7/17.
 */

fun main(args: Array<String>) {
    val q = readLine()!!.toInt()
    val arr = arrayListOf<Int>()

    for (i in 0..q - 1) {
        val input = readLine()!!.split(" ")
        val n = input[0]
        if (n.toInt() == 1) {
            if (arr.size == 0) println("No Food")
            else {
                val res = arr[arr.size - 1]
                arr.removeAt(arr.size - 1)
                println(res)
            }

        } else {
            val m = input[1]
            arr.add(m.toInt())
        }

    }


}
