/**
 * 闭包的使用方式
 */
package ch4.UsingClosures

class Equipment {
	def calculator
	
	Equipment (calc) {
		calculator = calc
	}
	
	def simulate() {
		println "Running simulation"
		calculator()//可能还会发送参数	
	}
}

def eq1 = new Equipment({println "Calculator 1"})
def aCalculator = {println "Calculator 2"}
def eq2 = new Equipment(aCalculator)
def eq3 = new Equipment(aCalculator)

eq1.simulate()
eq2.simulate()
eq3.simulate()