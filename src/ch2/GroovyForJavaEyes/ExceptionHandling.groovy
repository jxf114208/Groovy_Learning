/**
 * �쳣����
 */

def openFile(fileName){
	new FileInputStream(fileName)
}

//try {
//	openFile("noneexistenfile")
//} catch (FileNotFoundException ex) {
//	println "Oops: " + ex
//}


//����catch(ex)(����exǰ��û���κ�����)���Բ������������ǰ���κ��쳣��ע�⣺�����ܲ���Exception֮���Error��Throwable��Ҫ������Щ����ʹ��
//catch(Throwable throwable)
try {
	openFile("noneexistenfile")
} catch (ex) {//��������Exception���͵��쳣
	println "Oops: " + ex
}

try {
	openFile("noneexistenfile")
} catch(Throwable throwable) {//��������Throwable
	println "Oops: " + throwable
}