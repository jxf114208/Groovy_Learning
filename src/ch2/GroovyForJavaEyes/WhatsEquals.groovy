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

//��ʵ����Comparable�ӿڵ����ϣ�==������ѡ����comparTo��������equals()
new A() == new A()
new B() == new B()