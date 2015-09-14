/**
 * 使用MetaClass拦截方法
 */
package ch12.InterceptingMethodsUsingMOP


class Car1 implements GroovyInterceptable {
	def check() {System.out.println "check called..."}
	def start() {System.out.println "start called..."}
	def drive() {System.out.println "drive called..."}
}	

Car1.metaClass.invokeMethod = {String name, args ->
	System.out.print("Call to $name intercepted...")
	
	if (name != 'check') {
		System.out.print("running filter...")
		Car1.metaClass.getMetaMethod('check').invoke(delegate, null)
	}
	
	def valiMethod = Car.metaClass.getMetaMethod(name, args)
	if (valiMethod != null) {
		valiMethod.invoke(delegate, args)
	}else{
		Car1.metaClass.invokeMethod(delegate, name, args)
	}
}


car = new Car1()
car.start()
car.drive()
car.check()
try {
	car.speed()
} catch (e) {
	println e
}