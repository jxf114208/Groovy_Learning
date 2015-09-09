public class UseAGroovyClass {
	public static void main(String[] args){
		AGroovyClass instance = new AGroovyClass();
		Object result = instance.useClosure(new Object(){
			public String call(){
				return "You called from Groovy";
			}
		});
		
		System.out.println("Reveived: " + result);
	}
}