/**
 * 使用Object类的扩展
 * 
 * 使用上下文with()方法
 */
package ch7.ExploringGDK

//老的写法
//lst = [1,2]
//lst.add 3
//lst.add 4
//println lst.size()
//println lst.contains(2)

//新的写法
lst = [1,2]
lst.with {
	add 3
	add 4
	println size()
	println contains(2)
}


lst.with {
	println "this is $this"
	println "owner is $owner"
	println "delegage is $delegate"
}