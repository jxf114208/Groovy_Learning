/**
 * /**
 * ������չ
 * 
 * ʹ��java.io����չ
 */
package ch7.ExploringGDK

def file = new File(/C:\Users\Administrator\Desktop\test.txt/)

println file.text

file.eachLine {line -> println line}

println file.filterLine { it =~ /a/}