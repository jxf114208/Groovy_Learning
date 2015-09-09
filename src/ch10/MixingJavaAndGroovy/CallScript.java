import javax.script.*;

public class CallScript {
	public static void main(String[] args){
		ScriptEngineManager manger = new ScriptEngineManager();
		ScriptEngine engine = manger.getEngineByName("groovy");
		System.out.println("Calling script from Java");
		try{
			engine.eval("println 'Hello from Groovy'");
		}catch(ScriptException ex){
			System.out.println(ex);
		}
	}
}