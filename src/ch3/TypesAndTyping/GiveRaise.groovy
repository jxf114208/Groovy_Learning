/**
 * 多方法
 * 
 * 方法分派基于多个实体----目标加参数，所以这被称作多分派或多方法(Multimethods)
 */
package ch3.TypesAndTyping

void giveRaise(Employee employee) {
	employee.raise(new BigDecimal(10000.00))
}

giveRaise(new Employee())
giveRaise(new Executive())