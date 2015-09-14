/**
 * 使用metaClass拦截方法
 */
package ch12.InterceptingMethodsUsingMOP

Integer.metaClass.invokeMethod = {String name, args ->
	System.out.println("Call to $name intercepted on $delegate...")
	
	def valiMethod = Integer.metaClass.getMetaMethod(name, args)
	if (valiMethod == null) {
		Integer.metaClass.invokeMissingMethod(delegate, name, args)
	}else{
		System.out.print("running pre-filter...")
		result = valiMethod.invoke(delegate, args)
		
		System.out.print("running post-filter...")
		result
	}
}


println 5.floatValue()
println 5.intValue()
try {
	println 5.empty()
} catch (e) {
	println e
}