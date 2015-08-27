/**
 * 使用查找方法
 */
package ch6.WorkingWithCollections

lst = [4,3,1,2,4,1,8,9,2,6]

//find找第一次出现的匹配对象
//迭代一得到想要的值就返回trun，否则直到迭代结束返回null
println lst.find { it == 45 }

println lst.find { it > 4 }

//返回一个结果集
println lst.findAll { it == 2}

//返回索引
println lst.findIndexOf { it == 2 }

println lst.findAll()
println lst.findAll { it > 4 }