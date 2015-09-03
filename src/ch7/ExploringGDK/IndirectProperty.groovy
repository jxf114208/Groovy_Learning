/**
 * 使用Object类的扩展
 * 
 * 间接访问属性
 */
package ch7.ExploringGDK

class Car {
	int miles, fuelLevel
}

car = new Car(miles : 25, fuelLevel : 80)

//可以通过 properties 属性(也就是getProperties()方法) 获得其所有属性的列表
properties = ["miles", "fuelLevel"]

properties.each { name -> 
	println "$name = ${car[name]}"
}

car[properties[1]] = 100

println "fuelLevel now is $car.fuelLevel"