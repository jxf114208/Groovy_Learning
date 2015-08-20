/**
 * instanceOf检查类型，不需要类型检查
 */
package ch3.TypesAndTyping

import groovy.transform.TypeChecked;

def use(Object instance) {
	if (instance instanceof String) {
		println instance.length()//不必强制转换
	}else{
		println instance
	}
}

use 'hello'
use 4