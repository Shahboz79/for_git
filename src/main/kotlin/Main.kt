fun main(args: Array<String>) {

    //51- misol
//    val n=4
//    var a= intArrayOf(1,2,3,4)
//    var b= intArrayOf(34,12,3123,76)
//    var temp=0
//    for (i in 0..<n){
//        temp=b[i]
//         b[i]=a[i]
//        a[i]=temp
//    }
//    println("a = ${a.joinToString()}")
//    println("b = ${b.joinToString()}")
    //52-misol
    val n = 5
    var a = intArrayOf(1, 11, 23, 34, 12)
    var b = IntArray(n)
    for (i in a.indices) {
        if (a[i] < 5) {
            b[i] = 2 * a[i]
        } else {
            b[i] = a[i] / 2
        }
    }
    println(b.contentToString())


}