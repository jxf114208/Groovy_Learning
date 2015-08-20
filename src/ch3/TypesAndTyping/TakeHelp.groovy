/**
 * 动态类型
 * 能力式设计  Desing By Capability
 */
package ch3.TypesAndTyping

def takeHelp(helper) {
	helper.helpMoveThings()
	
	if(helper.metaClass.respondsTo(helper, "eatSugarcane")) {
		helper.eatSugarcane()
	}
}

class Man {
	void helpMoveThings() {
		println "Man's helping"
	}
}

class Woman {
	void helpMoveThings() {
		println "Woman's helping"
	}
}

class Elephant {
	void helpMoveThings() {
		println "Elephant's helping"
	}
	
	void eatSugarcane() {
		println "I love sugarcanes..."
	}
}

takeHelp(new Man())
takeHelp(new Woman())
takeHelp(new Elephant())
