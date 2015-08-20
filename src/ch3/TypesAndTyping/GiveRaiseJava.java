package ch3.TypesAndTyping;

import java.math.BigDecimal;

public class GiveRaiseJava {
	//多态，
	public static void giveRaise(Employee employee) {
		//基类Employee已经限制了参数是Number，所以这里不会调用重载方法
		employee.raise(new BigDecimal(10000.00));
	}
	
	public static void main(String[] args) {
		giveRaise(new Employee());
		giveRaise(new Executive());
	}
}
