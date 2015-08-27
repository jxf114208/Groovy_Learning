/**
 * 
 */
package ch6.WorkingWithCollections

import java.lang.annotation.ElementType;

lst = ['Programming', 'In', 'Groovy']

count = 0
lst.each { count += it.size() }
println count

println lst.collect { it.size() }.sum()


//inject() ��Լ�����ÿ��Ԫ�ص��ñհ�
println lst.inject(0) { carrOver, element -> carrOver + element.size() }

//����
println lst.join(' ')


//��ƽ
lst[0] = ['Be', 'Productive']
println lst

lst = lst.flatten()
println lst

//�Ƴ�Ԫ�ز�����һ���¼���
//minus()����
println lst - ['Productive', 'In']

//ÿ��Ԫ����ִ�в���
println lst.size()
//չ����������spread operator��
println lst*.size()


def words(a, b, c, d) {
	println "$a $b $c $d"
}

words(*lst)