/**
 * 字面常量与表达式
 */
package ch5.WorkingWithStrings

//单引号创建字符串字面变量
println 'He said, "That is Groovy"'

str = 'A string'
println str.getClass().name


//单引号创建的String看作一个纯粹的字面常量，不会解析其中的变量
value = 25
println 'The value is $value'

//java的String是不可变的，Groovy也信守这种不可变性
str = "hello"
println str[2]
try {
	str[2] = '!'
} catch (e) {
	println e
}

