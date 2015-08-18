/**
* 布尔求值
*/

//如果在需要布尔值的地方放了一个对象引用，Groovy会检查该引用是否为null。
//它将null视为false，将非null视为true，
str = 'hello'
//str = ''
if (str) { println true } else { println false }

//非空且元素数量不为0则为true，反之亦然
lst0 = null
println lst0 ? 'lst0 true' : 'lst0 false'
lst1 = [1, 2, 3]
println lst1 ? 'lst1 true' : 'lst1 false'
lst2 = []
println lst2 ? 'lst2 true' : 'lst2 false'
