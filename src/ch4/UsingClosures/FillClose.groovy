/**
 * ʹ�ñհ�������Դ����
 */
package ch4.UsingClosures


new FileWriter("output.txt").withWriter {writer ->
	writer.write("a")
}//����Ҫ�Լ�����close()