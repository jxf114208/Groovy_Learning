package ch2.GroovyForJavaEyes
import groovy.transform.Canonical
import groovy.transform.Immutable

/**
 * 使用Groovy代码生成变换
 * Groovy在groovy。transform包和其他一些包中提供了很多代码生成注解
 */

//使用@Canonical
//生成toString()方法
//默认情况下，它生成的代码包含所有字段，不过可以让它仅包含特定字段，而去掉其他字段
//@Canonical(excludes = "lastName, age")
@Canonical
class Person {
	def firstName, lastName, age
}

def sara = new Person(firstName: "Sara", lastName: "Walker", age: 49)
println sara


//使用@Delegate
class Worker {
	def work() { println "get work done" }
	def analyze() { println "analyze..." }
	def writeReport() { println "get report written" }
}
class Expert {
	def analyze() { println "expert analysis..." }
}
class Manager {
	@Delegate Expert expert = new Expert()
	@Delegate Worker worker = new Worker()
}

def bernie = new Manager()
bernie.analyze()
bernie.work()
bernie.writeReport()

//受用@Immutable
//作为反馈，Groovy给我们提供了一个构造器，其参数以类中字段定义的顺序依次列出
//还添加了hashCode(), equals() 和 toString()
@Immutable
class CreditCard {
	String cardNumber
	int creditLimit
}

println new CreditCard("4000-1111-2222-3333", 1000)

//使用@Lazy
//不仅推迟了创建，还将字段标记为volatile
class Heavy {
	def size = 10
	Heavy() {
		println "Creating Heavy with $size"
	}
}

class AsNeeded {
	def value
	@Lazy Heavy heavy1 = new Heavy()
	//创建逻辑包含在一个闭包中
	@Lazy Heavy heavy2 = { new Heavy(size: value) }()
	
	AsNeeded() {
		println "Created AsNeeded"
	}
}

def asNeeded = new AsNeeded(value: 1000)
println asNeeded.heavy1.size
println asNeeded.heavy1.size
println asNeeded.heavy2.size

//受用@Newify
@Newify([Person, CreditCard])
def fluentCreate() {
	println Person.new(firstName: "John", lastName: "Doe", age: 20)
	println Person(firstName: "John", lastName: "Doe", age: 20)
	println CreditCard("1234-5678-1234-5678", 2000)
}

fluentCreate()

//受用@Singleton
@Singleton(lazy = true)
class TheUnique {
	def hello() { println 'hello' }
}
println "Accessing TheUnique"
TheUnique.instance.hello()
TheUnique.instance.hello()