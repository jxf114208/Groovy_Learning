/**
 * Ω‚ŒˆXML
 * 
 *  π”√XmlSlurper
 */
package ch8.WorkingWithXML


languages = new XmlSlurper().parse(/D:\Workspaces\ggts-3.6.4.RELEASE\Groovy_Learning\src\ch8\WorkingWithXML\computerAndNaturalLanguages.xml/).declareNamespace(human: 'Natural')

print "Languages"
println languages.language.collect { it.@name }.join(', ')

print "Languages"
println languages.'human:language'.collect { it.@name }.join(', ')