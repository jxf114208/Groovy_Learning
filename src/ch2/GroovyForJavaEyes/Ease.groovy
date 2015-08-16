/**
 * 安全导航操作符
 */

def foo(str){
	//if (str != null) { str.reverse() }
	str?.reverse()
}

println foo('evil')
println foo(null)