/**
 * ����XML
 * 
 * ʹ��XmlParser
 */
package ch8.WorkingWithXML


languages = new XmlParser().parse(/D:\Workspaces\ggts-3.6.4.RELEASE\Groovy_Learning\src\ch8\WorkingWithXML\languages.xml/)

println "Languages and authors"

languages.each { println "${it.'@name'} authored by ${it.author[0].text()}" }

def languagesByAuthor = { authorName ->
	languages.findAll {it.author[0].text() == authorName}.collect { it.'@name'}.join(', ')
}

println "Languages by Wirth:" + languagesByAuthor('Wirth')
