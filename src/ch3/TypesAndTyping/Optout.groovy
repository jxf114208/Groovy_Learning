package ch3.TypesAndTyping

import groovy.transform.TypeChecked;
import groovy.transform.TypeCheckingMode;

@TypeChecked
class Sample {
	//此处静态类型检查生效
	def method1() {
		
	}
	
	//跳过
	@TypeChecked(TypeCheckingMode.SKIP)
	def method2(String str) {
		str.shout()
	}
}
