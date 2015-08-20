/**
 * 静态编译
 * 
 * 关闭动态类型，阻止元编程，放弃多方法，让Groovy生成性能足以与java媲美的，高效的字节码
 */
package ch3.TypesAndTyping

import groovy.transform.CompileStatic;


@CompileStatic
def shout1(String str) {
	println str.toUpperCase()
}

