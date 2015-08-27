/**
 * 使用Map类
 */
package ch6.WorkingWithCollections

langs = ['C++' : 'Stroustrup', 'Java' : 'Gosing', 'Lisp' : 'McCarthy']

println langs.getClass().name

println langs['Java']
println langs['C++']

println langs.Java

//println langs.C++
println langs.'C++'

//规规矩矩的键可以省略引号
langs = ['C++' : 'Stroustrup', Java : 'Gosing', Lisp : 'McCarthy']