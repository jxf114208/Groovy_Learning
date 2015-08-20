/**
 * 闭包委托
 * 
 * this、owner和delegate是闭包的三个属性，用于确定由哪个对象处理该闭包内的方法调用。
 * 一般而言，delegate会设置为owner，但是对其加以修改，可以挖掘出Groovy的一些非常好玩的元编程能力
 */
package ch4.UsingClosures

def examiningClosure(closure) {
	closure()
}

examiningClosure() {
	println "In First Closure:"
	println "class is ${getClass().name}"
	println "this is $this, super: ${this.getClass().superclass.name}"
	println "owner is $owner, super: ${owner.getClass().superclass.name}"
	println "delegate is $delegate, super: ${delegate.getClass().superclass.name}"
	
	examiningClosure() {
		println "In First within the First Closure:"
		println "class is ${getClass().name}"
		println "this is $this, super: ${this.getClass().superclass.name}"
		println "owner is $owner, super: ${owner.getClass().superclass.name}"
		println "delegate is $delegate, super: ${delegate.getClass().superclass.name}"
	}
}