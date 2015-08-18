package ch2.GroovyForJavaEyes

/**
 * 闭包与匿名内部类的冲突
 */

class Calibrator {
	Calibrator(calculationBlock) {
		print "using..."
		calculationBlock()
	}
}

def calibrator = new Calibrator({
	println "the calculation provided"
})
