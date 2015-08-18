package ch2.GroovyForJavaEyes
/**
* Java5特性的支持
* 静态导入
*/

import static Math.random as rand
import groovy.lang.ExpandoMetaClass as EMC

double value = rand()
def metaClass = new EMC(Integer)
assert metaClass.getClass().name == 'groovy.lang.ExpandoMetaClass'