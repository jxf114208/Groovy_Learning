/**
* 操作符重载
*/

//++ 映射的是String类的next()方法
for(ch = 'a'; ch < 'd'; ch++) {
	println ch
}

for(ch in 'a'..'c') {
	println ch
}


//要向集合添加元素，使用 << 操作符, 该操作符会被转换为Groovy在Collection上添加的leftShift()方法
lst = ['hello']
lst << 'there'
println lst


//+ 操作符添加plus() 方法
//重载时，必需保留预期的语义
class ComplexNumber {
	def real, imaginary
	def plus(other) {
		new ComplexNumber(real: real + other.real, imaginary: imaginary + other.imaginary)
	}
	String toString() {"$real ${imaginary > 0 ? '+' : ''} ${imaginary}i"}
}
c1 = new ComplexNumber(real: 1, imaginary: 2)
c2 = new ComplexNumber(real: 4, imaginary: 1)

println c1 + c2