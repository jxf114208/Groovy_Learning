/**
 * ����ArrayList
 * 
 * 
 */
package ch6.WorkingWithCollections

import org.codehaus.groovy.runtime.dgmimpl.NumberNumberDiv.DoubleDouble;

lst = [1,3,4,1,8,9,2,6]

/**
 * ʹ��List��each����
 */
//�������
lst.each { println it }
//�������
lst.reverseEach { println it }
//����������
lst.eachWithIndex { it, index -> println "$it --- $index" }

//���
total = 0
lst.each { total += it }
println "Total is $total"

//ÿ��Ԫ�ط�2��
doubled = []
lst.each { doubled << it * 2 } // << ������ӳ�䵽leftShift()����
println doubled


/**
 * ʹ��List��collect����
 */
//ÿ��Ԫ����ִ�в�������һ���������
println lst.collect { it * 2}