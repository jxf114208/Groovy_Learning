/**
 * GDKÒ»Æ³
 */

//java´úÂë
//package ch2.GroovyForJavaEyes;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//public class Excute {
//	public static void main(String[] args) {
//		try {
//			Process proc = Runtime.getRuntime().exec("groovy -v");
//			BufferedReader result = new BufferedReader(new InputStreamReader(
//					proc.getInputStream()));
//			String line;
//			while ((line = result.readLine()) != null) {
//				System.out.println(line);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}

println "cmd /C groovy -v".execute().text

println "cmd /C groovy -v".execute().getClass().name