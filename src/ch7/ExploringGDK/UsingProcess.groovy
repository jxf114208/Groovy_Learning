/**
 * ������չ
 * 
 * ʹ��java.lang����չ
 */
package ch7.ExploringGDK

process = "wc".execute()

process.out.withWriter {
	//�����뷢�͵�����
	it << "Let the World know...\n"
	it << "Groovy Rocks!\n"
}