package ch2.GroovyForJavaEyes
class A {
	boolean equals(other) {
		println "equals called"
		false
	}
}
class B implements Comparable {
	boolean equals(other) {
		println "equals called"
		false
	}

	int compareTo(other) {
		println "compareTo called"
		0
	}
}

//在实现了Comparable接口的类上，==操作符选择了comparTo，而不是equals()
new A() == new A()
new B() == new B()