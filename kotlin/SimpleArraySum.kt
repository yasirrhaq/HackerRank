fun simpleArraySum(ar: Array<Int>): Int {
    var result: Int = 0
    ar.forEach{            
        result += it
    }
    return result
}

fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}