/**
 * ��̬�հ� 
 */
package ch4.UsingClosures

//ʹ��parameterTypes (��getParameterTypes()����)��֪��Щ����������
def examine(closure) {
	println "$closure.maximumNumberOfParameters parameter(s) giver:"
	for (aParameter in closure.parameterTypes) {
		println aParameter.name
	}
	println "--"
}

examine() {}
examine() {it}
//�� -> ֮ǰû���βΣ�˵���ñհ��������κβ���
examine() {->}
examine() {vall ->}
examine() {Date vall ->}
examine() {Date vall, val2 ->}
examine() {Date vall, String val2 ->}
