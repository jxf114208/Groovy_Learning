package ch2.GroovyForJavaEyes

/**
 * 分号总是可选的
 */

//这种情况分号必须加，否则groovy会把实例初始化器解析为一个闭包
class Semi {
	def val = 3;
	
	//实例初始化器
	{
		println "Instance Initializer called..."
	}
}
println new Semi()

//这种情况下，实体初始化器放在静态初始化器之后的话，分号可以不加
class Semi1 {
	def val = 3
	
	//静态初始化器
	static {
		println "Static Initializer called..."
	}
	
	//实例初始化器
	{
		println "Instance Initializer called..."
	}
}
println new Semi1()