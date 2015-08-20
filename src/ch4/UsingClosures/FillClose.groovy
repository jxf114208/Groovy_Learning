/**
 * 使用闭包进行资源清理
 */
package ch4.UsingClosures


new FileWriter("output.txt").withWriter {writer ->
	writer.write("a")
}//不需要自己调用close()