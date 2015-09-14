/**
 * 
 */
package ch12.InterceptingMethodsUsingMOP

Integer.metaClass.invokeMethod = { String name, args -> /**/}
println Integer.metaClass.getClass().name
