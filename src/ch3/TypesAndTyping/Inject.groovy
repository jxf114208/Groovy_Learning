package ch3.TypesAndTyping

import groovy.transform.TypeChecked

@TypeChecked
def shoutString(String str) {
	//println str.shout()//����ʱ����
}

str = "hello"
str.metaClass.shout = {
	-> toUpperCase()
}
shoutString(str)