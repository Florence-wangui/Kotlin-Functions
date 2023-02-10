fun main(){
    // Invoking greetPerson()
    greetPerson("Victoria")
    greetPerson("Margaret")
    greetPerson("Henriette")

    // Invoking getModulus()
    var x = getModulus(24, 5)
    println(x)
    var y = getModulus(30, 7)
    println(y)

    // Invoking getSum()
    var a = getSum(1010, 1233, 234, 567)
    println(a)
    var b = getSum(49, 35, 45, 67)
    println(b)

    // Invoking displayFunFact()
    displayFunFact("If I were to travel I would go to Tobago")
    displayFunFact("I like cooking")


}

/*
Question 1
Create and invoke a function that takes in a name and prints out “Hello ${name}” e.g
given “Ada” it will print out “Hello Ada”
 */

fun greetPerson(name:String){
    println("Hello, $name.")
}

/*
Question 2
Create and invoke a function that given 2 numbers returns the remainder of their
division.
 */
fun getModulus(num1: Int, num2: Int): Int{
    var modulus = num1 % num2
    return modulus
}

/*
Question 3
Create and invoke function that returns the sum of any given 4 numbers
 */
fun getSum(param1: Int, param2: Int, param3: Int, param4: Int): Int{
    var addition = param1 + param2 + param3 + param4
    return addition
}


/*
Question 4
Create and invoke a function that prints out an interesting fact about yourself
 */
fun displayFunFact(fact: String){
    println("An interesting fun fact about me is: $fact.")
}