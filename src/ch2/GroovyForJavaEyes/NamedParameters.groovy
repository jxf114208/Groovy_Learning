/**
 * ����ʼ�����������
 */
class Rebot{
	def type,height,width
	
	//��һ������������Map
//	def access(location, weight, fragile) {
//		println "Received fragile? $fragile, weight: $weight, loc: $location"
//	}
	
	def access(Map location, weight, fragile) {
		println "Received fragile? $fragile, weight: $weight, loc: $location"
	}
}

rebot = new Rebot(type: 'arm', width: 10, height: 40)//�������޲ι���
println "$rebot.type, $rebot.height, $rebot.width"

rebot.access(x: 30, y: 20, z: 10, 50, true)
//�����޸Ĳ���˳��
rebot.access(50, true, x: 30, y: 20, z: 10)
