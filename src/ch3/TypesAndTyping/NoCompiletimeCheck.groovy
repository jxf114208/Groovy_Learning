/**
 * �رն�̬����
 * 
 * ��̬���ͼ��
 */

package ch3.TypesAndTyping

import groovy.transform.TypeChecked;

@TypeChecked
def shout(String str) {
	println "Printing in uppercase"
	println str.toUpperCase()
	println "Printing again in uppercase"
	//println str.toUppercase()//����ʱ����
}

try {
	shout('hello')
} catch (ex) {
	println "Failed..."
}