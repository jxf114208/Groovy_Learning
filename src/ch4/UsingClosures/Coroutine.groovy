/**
 * 闭包与协程
 * 
 * 调用一个函数或方法会在程序额执行序列中创建一个新的作用域。我们会在一个入口点（方法最上面的语句)进入函数。在方法完成后，回到调用者的作用域。
 * 
 * 协程则支持多个入口点，每个入口点都是上次挂起调用的位置
 */
package ch4.UsingClosures

def iterate(n, closure) {
	1.upto(n) {
		println "In iterate with vlaue $it"
		closure(it)
	}
}

println "Calling iterate"
total = 0
iterate(4) {
	total += it
	println "In closure total so far is $total"
}
println "Done"
