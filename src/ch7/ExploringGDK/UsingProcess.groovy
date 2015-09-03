/**
 * 其他扩展
 * 
 * 使用java.lang的扩展
 */
package ch7.ExploringGDK

process = "wc".execute()

process.out.withWriter {
	//将输入发送到进程
	it << "Let the World know...\n"
	it << "Groovy Rocks!\n"
}