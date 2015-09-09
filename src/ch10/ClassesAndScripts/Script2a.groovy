println "In Script2"
name = "Venkat"
shell = new GroovyShell(binding)
result = shell.evaluate(new File('Script1a.groovy'))

println "Script1a returned: $result"
println "Hello $name"