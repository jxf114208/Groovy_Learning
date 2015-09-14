/**
 * 使用GroovyInterceptable拦截方法
 */
package ch12.InterceptingMethodsUsingMOP


class Car implements GroovyInterceptable {
	def check() {System.out.println "check called..."}
	def start() {System.out.println "start called..."}
	def drive() {System.out.println "drive called..."}
	
	def invokeMethod(String name, args){
		System.out.print("Call to $name intercepted...")
		
		if (name != 'check') {
			System.out.print("running filter...")
			Car.metaClass.getMetaMethod('check').invoke(this, null)
		}
		
		def valiMethod = Car.metaClass.getMetaMethod(name, args)
		if (valiMethod != null) {
			valiMethod.invoke(this, args)
		}else{
			Car.metaClass.invokeMethod(this, name, args)
		}
	}
}

car = new Car()
car.start()
car.drive()
car.check()
try {
	car.speed()
} catch (e) {
	println e
}