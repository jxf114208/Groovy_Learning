package ch2.GroovyForJavaEyes

/**
 * �ֺ����ǿ�ѡ��
 */

//��������ֺű���ӣ�����groovy���ʵ����ʼ��������Ϊһ���հ�
class Semi {
	def val = 3;
	
	//ʵ����ʼ����
	{
		println "Instance Initializer called..."
	}
}
println new Semi()

//��������£�ʵ���ʼ�������ھ�̬��ʼ����֮��Ļ����ֺſ��Բ���
class Semi1 {
	def val = 3
	
	//��̬��ʼ����
	static {
		println "Static Initializer called..."
	}
	
	//ʵ����ʼ����
	{
		println "Instance Initializer called..."
	}
}
println new Semi1()