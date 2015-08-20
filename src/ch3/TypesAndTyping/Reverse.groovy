/**
 * 静态类型检查会限制使用动态方法。然而，它并没有阻止使用Groovy向JDK中的类型添加的方法。
 * 静态类型检查器会检查这些类中的方法和属性，它还会检查一个特殊的DefaultGroovyMethods类，其中包含了一些有用的，优雅的扩展方法，此外，它
 * 还会检查开发者能够添加的扩展
 */
package ch3.TypesAndTyping

def printlnReverse(String str) {
	println str.reverse() //没问题
}

 printlnReverse "hello"