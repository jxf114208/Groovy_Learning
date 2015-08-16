/**
 * 使用多赋值
 */

def splitName(fullName) { fullName.split(' ') }

def (firstName, lastName) = splitName("James Bond")
println "$lastName, $firstName $lastName"

//交换变量值
def name1 = "Thomson", name2 = "Thompson"
println "$name1 and $name2"
(name2, name1) = [name1, name2]
println "$name1 and $name2"

//而当变量与值得数目不匹配时，Groovy也可以优雅的处理。
//如果有多余的变量，Groovy会将他们设置为null
def (String cat, String mouse) = ['Tom', 'Jerry', 'Spike', 'Tyke']
println "$cat and $mouse"

//多余的值会被抛弃
def (first, second, Integer thrid) = ['Tom', 'Jerry']
println "$first, $second, and $thrid"
