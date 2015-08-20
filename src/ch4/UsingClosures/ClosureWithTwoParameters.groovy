/**
 * 向闭包传递多个参数
 */
package ch4.UsingClosures

def tellFortune(closure) {
	closure new Date("09/20/2012"), "You day is filled with ceremony"
}

tellFortune {date, fortune ->
	println "Forturn for $date is $fortune"
}


tellFortune {Date date, fortune ->
println "Forturn for $date is $fortune"
}
