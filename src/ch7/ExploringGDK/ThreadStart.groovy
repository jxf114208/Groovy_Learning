/**
 * 其他扩展
 * 
 * 使用java.lang的扩展
 */
package ch7.ExploringGDK

def printThreadInfo(msg) {
	def currentThread = Thread.currentThread()
	println "$msg Thread is ${currentThread}. Daemon? ${currentThread.isDaemon()}"
}


printThreadInfo('Main')

Thread.start {
	printThreadInfo "Started"
	sleep(3000) { println "Interrupted" }
	println "Finished Started"
}

sleep(1000)

Thread.startDaemon {
	printThreadInfo "Started Daemon"
	sleep(5000) { println "Interrupted" }
	println "Finished Started Daemon"
}