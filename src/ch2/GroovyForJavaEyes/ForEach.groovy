/**
* Java5特性的支持
* for-each
*/

String[] greetings = ["hello", "hi", "Howdy"]
//java风格的for-each循环中，必需指明类型或者使用def
for(String greet : greetings) {
	println greet
}

//如果不想指明类型，则使用in关键字代码冒号
for(greet in greetings){
	println greet
}