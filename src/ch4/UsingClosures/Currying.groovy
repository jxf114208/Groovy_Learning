/**
 * 科里化闭包
 * 
 * 闭包可能不接受任何形参，也可能接受多个形参。每次调用一个闭包时，它会期望我们为其每一个形参传入相应的实参。然后
 * 如果在多次调用之间，有一个或者多个实参是相同的，传参就会变得枯燥乏味。预先绑定一些闭包形参可以缓解这种痛苦。
 * 
 * 带有预绑定形参的闭包叫做科里化闭包（Curried Closure）
 * 
 * 当对一个闭包调用curry（）时，就是要求预先绑定某些形参。在预先绑定了一个形参之后，调用闭包时就不必重复为
 * 这个形参提供实参了。
 * 
 * 使用curry()方法科里化任意多个形参，但这些形参必需是从前面开始的连续若干个。也就是说，如果有n个形参，我们可以任意科里化前k个，其中 0 <= k <= n
 * 
 * 如果想科里化后面的形参，可以使用rcurry方法。
 * 如果想科里化形参列表中间的形参，可以使用ncurry()方法，传入要进行科里化的形参的位置，同时提供相应的值
 */
package ch4.UsingClosures

def tellFortunes(closure) {
	date = new Date("09/20/2012")
	closure date, "You day is filled with ceremony"
	closure date, "They're features, not bugs"
	//可以通过科里化避免重复发送date
	postFortune = closure.curry(date)
	postFortune "You day is filled with ceremony"
	postFortune "They're features, not bugs"
}

tellFortunes {date, fortune ->
	println "Fortune for $date is '$fortune'"
}
