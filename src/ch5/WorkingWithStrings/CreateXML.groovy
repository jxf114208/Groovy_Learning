/**
 * 多行字符串
 */
package ch5.WorkingWithStrings

langs = ['C++' : 'Stroustup', 'Java' : 'Gosling', 'Lisp' : 'McCarthy']

content = ''
langs.each {language, author ->
	fragment = """
		<language name="$language">
			<autor>$author</autor>
		</language>
	"""
	
	content  += fragment
}
xml = "<languages>$content</languages"
println xml
