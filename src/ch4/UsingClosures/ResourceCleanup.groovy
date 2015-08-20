/**
 * 使用闭包进行资源清理
 */
package ch4.UsingClosures

/**
 * @author Administrator
 *
 */
class Resource {
	def open() { print "opened..." }
	def close() {print "closed..."}
	def read() {print "read..."}
	def write() {print "write..."}
	
	def static use(closure) {
		def r = new Resource()
		try {
			r.open()
			closure(r)
		} finally {
			r.close()
		}
	}
}

def resource = new Resource()
resource.open()
resource.read()
resource.write()


Resource.use({Resource res -> 
	res.read()
	res.write()
})