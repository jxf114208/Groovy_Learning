/**
 * 灵活初始化与具名参数
 */
class Rebot{
	def type,height,width
	
	//第一个参数必需是Map
//	def access(location, weight, fragile) {
//		println "Received fragile? $fragile, weight: $weight, loc: $location"
//	}
	
	def access(Map location, weight, fragile) {
		println "Received fragile? $fragile, weight: $weight, loc: $location"
	}
}

rebot = new Rebot(type: 'arm', width: 10, height: 40)//必需有无参构造
println "$rebot.type, $rebot.height, $rebot.width"

rebot.access(x: 30, y: 20, z: 10, 50, true)
//可以修改参数顺序
rebot.access(50, true, x: 30, y: 20, z: 10)
