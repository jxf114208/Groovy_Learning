package ch3.TypesAndTyping;

import java.math.BigDecimal;

public class GiveRaiseJava {
	//��̬��
	public static void giveRaise(Employee employee) {
		//����Employee�Ѿ������˲�����Number���������ﲻ��������ط���
		employee.raise(new BigDecimal(10000.00));
	}
	
	public static void main(String[] args) {
		giveRaise(new Employee());
		giveRaise(new Executive());
	}
}
