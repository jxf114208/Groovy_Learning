/**
 * ��̬�����ڿ���ʹ��this������Class����
 */

//������������У�learn()�������ص���Class�������Կ���ʹ����ʽ����
class Wizard{
	def static learn(trick, action){
		print trick
		this
	}
}

Wizard.learn('a', {/*...*/}).learn('e',{/*..*/}).learn('l',{/*..*/})