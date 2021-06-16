fun getStringLength(obj:Any):Int?{
    if (obj is String){
        return obj.length
    }
    return null
}
fun main(args: Array<String>) {
    fun printLength(obj:Any){
        println("'$obj'你的名字共有${getStringLength(obj)?:"...錯誤，這個不是一個字串"}個字")
            }
    println("Hello World!")
    println("你好世界")
    println("輸入:")
    val name =readLine()
    printLength("$name")
}
