/**
 * 在Map上迭代
 */
package ch6.WorkingWithCollections


/**
 * Map的each方法
 */
langs = ['C++' : 'Stroustrup', 'Java' : 'Gosing', 'Lisp' : 'McCarthy']

//单个参数
langs.each { entry -> 
	println "Language $entry.key was authored by $entry.value"
}

//两个参数
langs.each { language, authro ->
	println "Language $language was authored by $authro"
}

/**
 * Map的collect()方法
 */
println langs.collect { language, author ->  
	language.replaceAll("[+]", "p")
}

/**
 * Map的find和findAll方法
 */
println "Looking for the first language with name greater than 3 characters"
entry = langs.find { language, author ->
	language.size() > 3
}
println "Found $entry.key written by $entry.value"


println "Looking for the first language with name greater than 3 characters"
selected = langs.findAll { language, author ->
	language.size() > 3
}

selected.each {k, v ->
	println "Found $k written by $v"
}


/**
 * Map上的其他便捷方法
 */
//any() 至少一个满足条件
print "Does any language name have a nonalphabetic character? "
println langs.any { language, author -> 
	language =~ /[^A-Za-z]/
}

//every() 全部满足条件
print "Does all language name have a nonalphabetic character? "
println langs.every { language, author -> 
language =~ /[^A-Za-z]/
}

//分组
//groupBy()
friends = [briang : 'Brian Goetz', brians : 'Brian Sletten', davidb : 'David Bock', davidg : 'David Geary', 
		scotted : 'Scott Davis', scottl : 'Scott Leberknight', stuarch : 'Stuart Halloway'
	]

groupByFirstName = friends.groupBy { it.value.split(' ')[0] }
println groupByFirstName

groupByFirstName.each {
	firstName, buddies ->
	println "$firstName : ${buddies.collect {key, fullName -> fullName}.join(', ')}"
}