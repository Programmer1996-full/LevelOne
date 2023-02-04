fun main(args: Array<String>) {
    val lives=0
    var isGameOver=(lives<1)
    if(isGameOver){
        println("Game over!")
    }
    else
    {
        println("You're still alive!")
    }

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
}