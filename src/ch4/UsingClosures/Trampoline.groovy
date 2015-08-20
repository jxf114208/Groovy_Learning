/**
 * Î²µÝ¹é
 * 
 * trampoline()
 */
package ch4.UsingClosures

def factorial
factorial = {int number, BigInteger theFactorial -> 
	number == 1 ? theFactorial : factorial.trampoline(number - 1, number * theFactorial)
}.trampoline()

println "factorial of 5 is ${factorial(5, 1)}"
println "Number of bits in the result is ${factorial(5000, 1).bitCount()}"


def factorial(int factorialFor) {
	def tailFactorial
	tailFactorial = {int number, BigInteger theFactorial = 1 ->
		number == 1 ? theFactorial : tailFactorial.trampoline(number - 1, number * theFactorial)
	}.trampoline()
	
	tailFactorial(factorialFor)
}

println "factorial of 5 is ${factorial(5, 1)}"
println "Number of bits in the result is ${factorial(5000, 1).bitCount()}"