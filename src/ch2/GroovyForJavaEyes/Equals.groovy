package ch2.GroovyForJavaEyes
/**
 * Groovy��  == �ȼ��� Java �� equals()
 */

//�Ƚ�����ʹ��is()
str1 = 'hello'
str2 = str1
str3 = new String('hello')
str4 = 'hello'

println "str1 == str2: ${str1 == str2}"
println "str1 == str3: ${str1 == str3}"
println "str1 == str4: ${str1 == str4}"
println "str1.is str2: ${str1.is str2}"
println "str1.is str3: ${str1.is str3}"
println "str1.is str4: ${str1.is str4}"