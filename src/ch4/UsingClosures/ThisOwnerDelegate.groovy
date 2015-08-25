/**
 * �հ�ί��
 * 
 * this��owner��delegate�Ǳհ����������ԣ�����ȷ�����ĸ�������ñհ��ڵķ������á�
 * һ����ԣ�delegate������Ϊowner�����Ƕ�������޸ģ������ھ��Groovy��һЩ�ǳ������Ԫ�������
 */
package ch4.UsingClosures

def examiningClosure(closure) {
	closure()
}

examiningClosure() {
	println "In First Closure:"
	println "class is ${getClass().name}"
	println "this is $this, super: ${this.getClass().superclass.name}"
	println "owner is $owner, super: ${owner.getClass().superclass.name}"
	println "delegate is $delegate, super: ${delegate.getClass().superclass.name}"
	
	examiningClosure() {
		println "In First within the First Closure:"
		println "class is ${getClass().name}"
		println "this is $this, super: ${this.getClass().superclass.name}"
		println "owner is $owner, super: ${owner.getClass().superclass.name}"
		println "delegate is $delegate, super: ${delegate.getClass().superclass.name}"
	}
}