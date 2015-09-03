/**
 * 使用Object类的扩展
 * 
 * 使用Sleep
 */
package ch7.ExploringGDK

//在给定的毫秒数时间内睡眠时，该方法会忽略中断
thread = Thread.start {
	println "Thread started"
	startTime = System.nanoTime()
	new Object().sleep(2000)
	endTime = System.nanoTime()
	println "Thread done in ${(endTime - startTime)/10**9} seconds"
} 
new Object().sleep(100)
println "Let's interrupt that thread"
thread.interrupt()
thread.join()

def playWithSleep(flag) {
	thread = Thread.start {
		println "Thread started"
		startTime = System.nanoTime()
		new Object().sleep(2000) {
			println "Interrupted... " + it
			flag //false值，sleep()将继续
		}
		endTime = System.nanoTime()
		println "Thread done in ${(endTime - startTime)/10**9} seconds"
	}
	
	thread.interrupt()
	thread.join()
}

playWithSleep(true) //true 打断
playWithSleep(false)//false 不打断