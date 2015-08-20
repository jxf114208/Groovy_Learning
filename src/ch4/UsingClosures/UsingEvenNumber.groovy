/**
 * 闭包的便利性
 * 
 * 传统方式
 */
package ch4.UsingClosures


def sum(n) {
	total = 0
	for(i = 2; i <= n; i += 2) {
		total += i
	}
	total
}
println "Sum of even numbers form 1 to 10 is ${sum(10)}"

def product(n) {
	prod = 1
	for(i = 2; i <= n; i += 2) {
		prod *= i
	}
	prod
}
println "Product of even numbers form 1 to 10 is ${product(10)}"

def sqr(n) {
	squared = []
	for(i = 2; i <= n; i += 2) {
		squared << i ** 2
	}
	squared
}
println "squared of even numbers form 1 to 10 is ${sqr(10)}"