println "In Script2"
shell = new GroovyShell()
shell.evaluate(new File('Script1.groovy'))