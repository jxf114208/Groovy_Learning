/**
 * 使用List
 */
package ch6.WorkingWithCollections

lst = [1,3,4,1,8,9,2,6]
println lst
println lst.getClass().name

println lst[0]
println lst[lst.size() - 1]

//负的索引值
println lst[-1]
println lst[-2]

//Range对象获得集合中几个连续的值
println lst[2..5]

println lst[-6..-3]

//2.4.4 已经是复制一个新的集合，和lst没有任何关系
subLst = lst[2..5]
println subLst.dump()
subLst[0] = 55
println "After sublst[0]=55 lst = $lst"
println subLst