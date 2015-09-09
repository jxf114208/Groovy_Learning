def printInfo(obj) {
	//假定用户从标准输入键入这些值
	usrRequestedProperty = 'bytes'
	usrRequestedMethod = 'toUpperCase'
	
	println obj[usrRequestedProperty]
	//或
	println obj."$usrRequestedProperty"
	
	println obj."$usrRequestedMethod"()
	//或
	println obj.invokeMethod(usrRequestedMethod, null)
}

printInfo("hello")


println "Properties of 'hello' are: "
'hello'.properties.each {println it}