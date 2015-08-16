/**
* 可选形参
*/

def log(x, base = 10) {
	Math.log(x) / Math.log(base)
}

println log(1024)
println log(1024, 10)
println log(1024, 2)


//Groovy还会把末尾数组形参视作可选的
def task(name, String[] details) {
	println "$name - $details"
}

task 'Call', '123-456-7890'
task 'Call', '123-456-7890', '231-546-0987'
task 'Check Mail'