/**
 * instanceOf������ͣ�����Ҫ���ͼ��
 */
package ch3.TypesAndTyping

import groovy.transform.TypeChecked;

def use(Object instance) {
	if (instance instanceof String) {
		println instance.length()//����ǿ��ת��
	}else{
		println instance
	}
}

use 'hello'
use 4