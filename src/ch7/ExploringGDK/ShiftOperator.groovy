/**
 * /**
 * ������չ
 * 
 * ʹ��java.io����չ
 */
package ch7.ExploringGDK

def file = new File(/C:\Users\Administrator\Desktop\test.txt/)

file.withWriter {
	it << 'some data...'
}

println file.text