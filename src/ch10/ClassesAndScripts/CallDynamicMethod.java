public class CallDynamicMethod {
	public static void main(String[] args){
		groovy.lang.GroovyObject instance = new DynamicGroovyClass();
		
		Object result1 = instance.invokeMethod("squeak", new Object[] {});
		System.out.println("Reveived: " + result1);
		
		Object result2 = instance.invokeMethod("quack", new Object[] {"like","a","duck"});
		System.out.println("Reveived: " + result2);
	}
}