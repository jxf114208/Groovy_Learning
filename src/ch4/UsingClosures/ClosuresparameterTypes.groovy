/**
 * 动态闭包 
 */
package ch4.UsingClosures

//使用parameterTypes (或getParameterTypes()方法)获知这些参数的类型
def examine(closure) {
	println "$closure.maximumNumberOfParameters parameter(s) giver:"
	for (aParameter in closure.parameterTypes) {
		println aParameter.name
	}
	println "--"
}

examine() {}
examine() {it}
//在 -> 之前没有形参，说明该闭包不接受任何参数
examine() {->}
examine() {vall ->}
examine() {Date vall ->}
examine() {Date vall, val2 ->}
examine() {Date vall, String val2 ->}
