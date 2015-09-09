import javax.script.*;

public class ParameterPassing {
	public static void main(String[] args){
		ScriptEngineManager manger = new ScriptEngineManager();
		ScriptEngine engine = manger.getEngineByName("groovy");
		engine.put("name","Venkat");
		try{
			engine.eval("println \"Hello $name from Groovy\"; name += '!' ");
		}catch(ScriptException ex){
			System.out.println(ex);
		}
		
		String name = (String)engine.get("name");
		System.out.println("Back in Java:" + name);
	}
}