/**
 * ʹ��Object�����չ
 * 
 * ��ӷ�������
 */
package ch7.ExploringGDK

class Car {
	int miles, fuelLevel
}

car = new Car(miles : 25, fuelLevel : 80)

//����ͨ�� properties ����(Ҳ����getProperties()����) ������������Ե��б�
properties = ["miles", "fuelLevel"]

properties.each { name -> 
	println "$name = ${car[name]}"
}

car[properties[1]] = 100

println "fuelLevel now is $car.fuelLevel"