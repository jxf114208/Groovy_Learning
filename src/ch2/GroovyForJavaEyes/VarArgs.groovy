package ch2.GroovyForJavaEyes
/**
 * Java5特性的支持
 * 变长参数
 */

def receiveVarArgs(int a, int... b) {
	println "You passed $a and $b"
}

def receiveArray(int a, int[] b) {
	println "You passed $a and $b"
}

receiveVarArgs(1, 2, 3, 4, 5)
receiveArray(1, 2,3,4,5)


//Groovy会将包围在方括号中的值看作ArrayList的一个实例，而不是数组。
//要发送数组， 可以定义一个指向数组的引用或使用as操作符
int[] values = [2,3,4,5]
receiveVarArgs(1, values)
receiveVarArgs(1, [2,3,4,5] as int[])
receiveVarArgs(1, [2,3,4,5])