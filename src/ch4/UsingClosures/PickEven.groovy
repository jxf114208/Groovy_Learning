/**
 * 闭包的便利性
 * 
 * groovy方式
 */
package ch4.UsingClosures

def pickEven(n, block) {
	for(i = 2; i <= n; i += 2){
		block(i)
	}
}

//pickEven 10, { println it}

//替换默认变量it为evenNumber
//pickEven 10, { evenNumber -> println evenNumber}

total = 0
pickEven(10) { total += it }
println "Sum of even numbers form 1 to 10 is ${total}"

prod = 1
pickEven(10) { prod *= it }
println "Product of even numbers form 1 to 10 is ${prod}"

sqr = []
pickEven(10) { sqr << it ** 2 }
println "squared of even numbers form 1 to 10 is ${sqr}"