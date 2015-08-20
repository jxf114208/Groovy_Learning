/**
 * 关闭动态类型
 * 
 * 静态类型检查
 */

package ch3.TypesAndTyping

import groovy.transform.TypeChecked;

@TypeChecked
def shout(String str) {
	println "Printing in uppercase"
	println str.toUpperCase()
	println "Printing again in uppercase"
	//println str.toUppercase()//编译时出错
}

try {
	shout('hello')
} catch (ex) {
	println "Failed..."
}