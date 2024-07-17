//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
    /**
     * This function calculates the sum of all integers from 1 to n.
     * @param n The maximum integer to include in the sum.
     * @return The sum of integers from 1 to n.
     */
    fun sumIntegers(n: Int): Int {
        return (1..n).sum()
    }

    fun main() {
        val max = 5
        val sum = sumIntegers(max)
        println("Sum of integers from 1 to $max is $sum") // Output: Sum of integers from 1 to 5 is 15


        /**
         * This function calculates the factorial of a given number iteratively.
         * @param n The number to find the factorial of.
         * @return The factorial of the given number.
         */
        fun factorialIterative(n: Int): Int {
            var result = 1
            for (i in 1..n) {
                result *= i
            }
            return result
        }

        fun main() {
            val num = 5
            val factorial = factorialIterative(num)
            println("Factorial of $num is $factorial") // Output: Factorial of 5 is 120



            /**
             * This function calculates the factorial of a given number using a lambda expression.
             * @param n The number to find the factorial of.
             * @return The factorial of the given number.
             */
            val factorialLambda: (Int) -> Int = { n ->
                if (n == 0) 1 else (1..n).reduce { acc, i -> acc * i }
            }

            fun main() {
                val num = 5
                val factorial = factorialLambda(num)
                println("Factorial of $num is $factorial") // Output: Factorial of 5 is 120


                /**
                 * This function calculates the factorial of a given number recursively.
                 * @param n The number to find the factorial of.
                 * @return The factorial of the given number.
                 */
                fun factorialRecursive(n: Int): Int {
                    return if (n == 0) 1 else n * factorialRecursive(n - 1)
                }

                fun main() {
                    val num = 5
                    val factorial = factorialRecursive(num)
                    println("Factorial of $num is $factorial") // Output: Factorial of 5 is 120
                }