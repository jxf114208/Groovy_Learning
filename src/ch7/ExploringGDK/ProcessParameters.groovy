/**
 * 其他扩展
 * 
 * 使用java.lang的扩展
 */
package ch7.ExploringGDK

String[] command = ['cmd', 'groovy', '-e', '"print \'Groovy\'"']
println "Calling ${command.join(' ')}"
println command.execute().text