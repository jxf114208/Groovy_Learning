/**
 * 
 */
package ch6.WorkingWithCollections

import java.lang.annotation.ElementType;

lst = ['Programming', 'In', 'Groovy']

count = 0
lst.each { count += it.size() }
println count

println lst.collect { it.size() }.sum()


//inject() 会对集合中每个元素调用闭包
println lst.inject(0) { carrOver, element -> carrOver + element.size() }

//连接
println lst.join(' ')


//拉平
lst[0] = ['Be', 'Productive']
println lst

lst = lst.flatten()
println lst

//移除元素并返回一个新集合
//minus()方法
println lst - ['Productive', 'In']

//每个元素上执行操作
println lst.size()
//展开操作符（spread operator）
println lst*.size()


def words(a, b, c, d) {
	println "$a $b $c $d"
}

words(*lst)