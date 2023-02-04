fun main(args: Array<String>) {
    println("How old are you: ")
    val age= readLine()!!.toInt()
    println("age is $age")

    val message:String=
    when{
        age<18->"You're too young to vote"
        age==100->"Contralations"
        else->"You can vote"
    }
    println(message)

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
}