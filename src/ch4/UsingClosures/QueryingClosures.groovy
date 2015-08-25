/**
 * ��̬�հ�
 */
package ch4.UsingClosures

//��̬��ȷ��һ���հ������Ĳ�������Ŀ������
def completeOrder(amount, taxComputer) {
	tax = 0
	if (taxComputer.maximumNumberOfParameters == 2) {
		tax = taxComputer(amount, 6.05)
	} else {
		tax = taxComputer(amount)
	}
	println "Scales tax is $tax"
}

completeOrder(100) {
	it * 0.0825
}

completeOrder(100) {amount, rate ->
	amount * (rate/100)
}