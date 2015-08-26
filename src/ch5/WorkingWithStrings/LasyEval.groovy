/**
 * GString 的惰性求值问题
 */
package ch5.WorkingWithStrings

price = 684.71
company = 'Google'
quote = "Today $company stock closed at $price"
println quote

stocks = [Apple : 663.01, Microsoft : 30.95]
stocks.each {key, value ->
	company = key
	price = value
	println quote
}

companyClosure = { it.write(company)}
priceClosure = { it.write("$price")}
quote = "Today ${companyClosure} stock closed at ${priceClosure}"
stocks.each {key, value->
	company = key
	price = value
	println quote
}

//无参闭包 使用 -> 来定义
quote = "Today ${-> company} stock closed at ${-> price}"
stocks.each {key, value->
	company = key
	price = value
	println quote
}