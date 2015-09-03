/**
 * ´´½¨XML
 */
package ch8.WorkingWithXML

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
xml = "<languages>$content</languages>"
println xml