/**
 * ������չ
 * 
 * ʹ��java.lang����չ
 */
package ch7.ExploringGDK

String[] command = ['cmd', 'groovy', '-e', '"print \'Groovy\'"']
println "Calling ${command.join(' ')}"
println command.execute().text