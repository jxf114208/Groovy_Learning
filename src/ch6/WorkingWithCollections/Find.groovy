/**
 * ʹ�ò��ҷ���
 */
package ch6.WorkingWithCollections

lst = [4,3,1,2,4,1,8,9,2,6]

//find�ҵ�һ�γ��ֵ�ƥ�����
//����һ�õ���Ҫ��ֵ�ͷ���trun������ֱ��������������null
println lst.find { it == 45 }

println lst.find { it > 4 }

//����һ�������
println lst.findAll { it == 2}

//��������
println lst.findIndexOf { it == 2 }

println lst.findAll()
println lst.findAll { it > 4 }