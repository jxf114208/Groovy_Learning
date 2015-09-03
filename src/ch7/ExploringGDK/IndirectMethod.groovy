/**
 * 使用Object类的扩展
 * 
 * 间接调用方法
 */
package ch7.ExploringGDK

class Person {
	def walk() {println "Walking..."}
	def walk(int miles) {println "Walking $miles miels..."}
	def walk(int miles, String where) {println "Walking $miles miels $where AAA..."}
//	def walk(List list) {println "Walking ${list[0]} miels ${list[1]} BBB..."}
}

peter = new Person()

peter.invokeMethod("walk", null)
peter.invokeMethod("walk", 10)
peter.invokeMethod("walk", [2, 'upill'] as Object[])
peter.invokeMethod("walk", [2, 'upill'])