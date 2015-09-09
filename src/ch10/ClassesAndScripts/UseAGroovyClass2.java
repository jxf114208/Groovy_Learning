public class UseAGroovyClass2 {
	public static void main(String[] args){
		AGroovyClass instance = new AGroovyClass();
		Object result = instance.passToClosure(2, new Object(){
			public String call(int value){
				return "You called from Groovy with value " + value;
			}
		});
		
		System.out.println("Reveived: " + result);
	}
}