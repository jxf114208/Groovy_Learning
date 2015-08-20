/**
 * 动态闭包
 */
package ch4.UsingClosures

//判断闭包是否存在
def doSomeThing(closure) {
	if (closure) {
		closure()
	} else {
		println "Using default implementation"
	}
}

doSomeThing() {
	println "Use specialized implementation"
}
doSomeThing()
