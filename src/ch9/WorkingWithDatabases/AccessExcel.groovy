/**
 * ∑√Œ MircroSoft Excel
 */
package ch9.WorkingWithDatabases

import groovy.sql.Sql;

def sql = Sql.newInstance(
"""jdbc:odbc:Driver=
{Microsoft Excel Driver (*.xls, *.xlsx, *.xlsm, *.xlsb)};
DBQ=D:/Workspaces/ggts-3.6.4.RELEASE/Groovy_Learning/src/ch9/WorkingWithDatabases/weather.xlsx;
READONLY=false""", '', '')

println "City\t\tTemperature"
sql.eachRow('Select * from [temperatures$]') {
	println "${it.city}\t\t$it.temperature"
}