val action = Actions()
fun main(args: Array<String>) {
    action.startProgram()
    action.helpInfo()
    while (true) {
        when(readln().toString()) {
            Commands.startCommand -> action.startProgram()
            Commands.helpCommand -> action.helpInfo()
            Commands.finishCommand -> action.finishProgram()
            else -> action.errorInfo()
        }
    }
}