package ch2.GroovyForJavaEyes
/**
 * Java5���Ե�֧��
 * �䳤����
 */

def receiveVarArgs(int a, int... b) {
	println "You passed $a and $b"
}

def receiveArray(int a, int[] b) {
	println "You passed $a and $b"
}

receiveVarArgs(1, 2, 3, 4, 5)
receiveArray(1, 2,3,4,5)


//Groovy�Ὣ��Χ�ڷ������е�ֵ����ArrayList��һ��ʵ�������������顣
//Ҫ�������飬 ���Զ���һ��ָ����������û�ʹ��as������
int[] values = [2,3,4,5]
receiveVarArgs(1, values)
receiveVarArgs(1, [2,3,4,5] as int[])
receiveVarArgs(1, [2,3,4,5])