/**
 * ½âÎöXML
 * 
 * Ê¹ÓÃDOMCategory
 */
package ch8.WorkingWithXML

import groovy.xml.DOMBuilder;
import groovy.xml.dom.DOMCategory;

document = DOMBuilder.parse(new FileReader(/D:\Workspaces\ggts-3.6.4.RELEASE\Groovy_Learning\src\ch8\WorkingWithXML\languages.xml/))

rootElement = document.documentElement

use(DOMCategory) {
	println "Languages and authors"
	languages = rootElement.language
	languages.each {
		println "${it.'@name'} authored by ${it.author[0].text()}"
	}
	
	def languagesByAuthor = { authorName ->
		languages.findAll {it.author[0].text() == authorName}.collect {
			it.'@name'}.join(', ')
	}
	
	println "Languages by Wirth:" + languagesByAuthor('Wirth')
}