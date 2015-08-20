/**
 * 动态闭包
 */
package ch4.UsingClosures

//动态地确定一个闭包期望的参数的数目和类型
def completeOrder(amount, taxComputer) {
	tax = 0
	if (taxComputer.maximumNumberOfParameters == 2) {
		tax = taxComputer(amount, 6.05)
	} else {
		tax = taxComputer(amount)
	}
	println "Scales tax is $tax"
}

completeOrder(100) {
	it * 0.0825
}

completeOrder(100) {amount, rate ->
	amount * (rate/100)
}