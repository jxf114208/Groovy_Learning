package ch3.TypesAndTyping

import groovy.transform.TypeChecked;
import groovy.transform.TypeCheckingMode;

@TypeChecked
class Sample {
	//�˴���̬���ͼ����Ч
	def method1() {
		
	}
	
	//����
	@TypeChecked(TypeCheckingMode.SKIP)
	def method2(String str) {
		str.shout()
	}
}
