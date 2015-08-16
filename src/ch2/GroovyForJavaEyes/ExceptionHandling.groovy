/**
 * 异常处理
 */

def openFile(fileName){
	new FileInputStream(fileName)
}

//try {
//	openFile("noneexistenfile")
//} catch (FileNotFoundException ex) {
//	println "Oops: " + ex
//}


//利用catch(ex)(变量ex前面没有任何类型)可以捕获摆在我们面前的任何异常。注意：它不能捕获Exception之外的Error或Throwable。要捕获这些，请使用
//catch(Throwable throwable)
try {
	openFile("noneexistenfile")
} catch (ex) {//捕获所有Exception类型的异常
	println "Oops: " + ex
}

try {
	openFile("noneexistenfile")
} catch(Throwable throwable) {//捕获所有Throwable
	println "Oops: " + throwable
}