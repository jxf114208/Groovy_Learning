/**
 * ��Map�ϵ���
 */
package ch6.WorkingWithCollections


/**
 * Map��each����
 */
langs = ['C++' : 'Stroustrup', 'Java' : 'Gosing', 'Lisp' : 'McCarthy']

//��������
langs.each { entry -> 
	println "Language $entry.key was authored by $entry.value"
}

//��������
langs.each { language, authro ->
	println "Language $language was authored by $authro"
}

/**
 * Map��collect()����
 */
println langs.collect { language, author ->  
	language.replaceAll("[+]", "p")
}

/**
 * Map��find��findAll����
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
 * Map�ϵ�������ݷ���
 */
//any() ����һ����������
print "Does any language name have a nonalphabetic character? "
println langs.any { language, author -> 
	language =~ /[^A-Za-z]/
}

//every() ȫ����������
print "Does all language name have a nonalphabetic character? "
println langs.every { language, author -> 
language =~ /[^A-Za-z]/
}

//����
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