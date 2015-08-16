/**
 * 静态方法内可以使用this来引用Class对象
 */

//在下面的例子中，learn()方法返回的是Class对象，所以可以使用链式调用
class Wizard{
	def static learn(trick, action){
		print trick
		this
	}
}

Wizard.learn('a', {/*...*/}).learn('e',{/*..*/}).learn('l',{/*..*/})