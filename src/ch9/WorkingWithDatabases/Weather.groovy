/**
 * 
 */
package ch9.WorkingWithDatabases

import groovy.sql.Sql
import groovy.xml.MarkupBuilder

//���ӵ����ݿ�
def sql = Sql.newInstance("jdbc:mysql://localhost:3306/weartherinfo", "root", "1234", "com.mysql.jdbc.Driver")

println sql.connection.catalog


//���ݿ��Select����
println "City                  Temperature"
sql.eachRow('Select * from weather') {
	printf "%-20s%s\n", it.city, it[1]
}


processMeta = { metaData ->
	metaData.columnCount.times {
		printf("%-21s", metaData.getColumnLabel(it + 1))
	}
	println ""
}


sql.eachRow('Select * from weather', processMeta) {  
	printf "%-20s %s\n", it.city, it[1]
}


rows = sql.rows('Select * from weather')
println "Weather info available for ${rows.size()} cites"

//������תΪXML��ʾ
bldr = new MarkupBuilder()

bldr.weather {
	sql.eachRow('Select * from weather') {
		city(name: it.city, temperature: it[1])
	}
}

//ʹ��DataSet
dataSet = sql.dataSet("weather")
citiesBelowFreezing = dataSet.findAll { it.temperature < 32 }
println "Cities below freezing:"
//citiesBelowFreezing.each {
//	println it.city
//}


println "Number of cities: " + sql.rows('Select * from weather').size()
dataSet.add(city: 'Denver', temperature: 19)
println "Number of cities: " + sql.rows('Select * from weather').size()


temperature = 50
sql.executeInsert("""
	insert into weather(city,temperature) values('Oklahoma City',$temperature);
""")
println sql.firstRow('Select * from weather where city = "Oklahoma City"')