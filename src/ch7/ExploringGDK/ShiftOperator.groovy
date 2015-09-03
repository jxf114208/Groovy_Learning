/**
 * /**
 * 其他扩展
 * 
 * 使用java.io的扩展
 */
package ch7.ExploringGDK

def file = new File(/C:\Users\Administrator\Desktop\test.txt/)

file.withWriter {
	it << 'some data...'
}

println file.text