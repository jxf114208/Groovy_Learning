class DynamicGroovyClass {
	def methodMissing(String name, args){
		println "You called $name with ${args.join(', ')}."
		args.size()
	}
}