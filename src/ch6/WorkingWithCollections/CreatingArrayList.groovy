/**
 * ʹ��List
 */
package ch6.WorkingWithCollections

lst = [1,3,4,1,8,9,2,6]
println lst
println lst.getClass().name

println lst[0]
println lst[lst.size() - 1]

//��������ֵ
println lst[-1]
println lst[-2]

//Range�����ü����м���������ֵ
println lst[2..5]

println lst[-6..-3]

//2.4.4 �Ѿ��Ǹ���һ���µļ��ϣ���lstû���κι�ϵ
subLst = lst[2..5]
println subLst.dump()
subLst[0] = 55
println "After sublst[0]=55 lst = $lst"
println subLst