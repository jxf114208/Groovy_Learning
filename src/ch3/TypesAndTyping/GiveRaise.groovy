/**
 * �෽��
 * 
 * �������ɻ��ڶ��ʵ��----Ŀ��Ӳ����������ⱻ��������ɻ�෽��(Multimethods)
 */
package ch3.TypesAndTyping

void giveRaise(Employee employee) {
	employee.raise(new BigDecimal(10000.00))
}

giveRaise(new Employee())
giveRaise(new Executive())