/**
 * 字面常量与表达式
 */
package ch5.WorkingWithStrings

//双引号("")或者正斜杠(//)创建一个表达式
//双引号经常用于定义字符串表达式
//正斜杠则用于正则表达式
value = 12
println "He paid \$$value for that."

what = new StringBuilder('fence')
text = "The cow jumped over the $what"
println text

what.replace(0, 5, "moon")
println text


//智能分析字符串
def printClassInfo(obj) {
	println "class: ${obj.getClass().name}"
	println "superclass: ${obj.getClass().superclass.name}"
}

val = 125
printClassInfo "The Stock closed at $val"
printClassInfo (/The Stock closed at $val/)
printClassInfo "This is a simple String"