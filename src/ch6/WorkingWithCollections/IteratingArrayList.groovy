/**
 * 迭代ArrayList
 * 
 * 
 */
package ch6.WorkingWithCollections

import org.codehaus.groovy.runtime.dgmimpl.NumberNumberDiv.DoubleDouble;

lst = [1,3,4,1,8,9,2,6]

/**
 * 使用List的each方法
 */
//正向迭代
lst.each { println it }
//反向迭代
lst.reverseEach { println it }
//计数或索引
lst.eachWithIndex { it, index -> println "$it --- $index" }

//求和
total = 0
lst.each { total += it }
println "Total is $total"

//每个元素翻2倍
doubled = []
lst.each { doubled << it * 2 } // << 操作符映射到leftShift()方法
println doubled


/**
 * 使用List的collect方法
 */
//每个元素上执行操作返回一个结果集合
println lst.collect { it * 2}