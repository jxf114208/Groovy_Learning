package ch2.GroovyForJavaEyes

/**
 * �հ��������ڲ���ĳ�ͻ
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
