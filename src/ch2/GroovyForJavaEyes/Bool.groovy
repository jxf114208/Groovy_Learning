/**
* ������ֵ
*/

//�������Ҫ����ֵ�ĵط�����һ���������ã�Groovy����������Ƿ�Ϊnull��
//����null��Ϊfalse������null��Ϊtrue��
str = 'hello'
//str = ''
if (str) { println true } else { println false }

//�ǿ���Ԫ��������Ϊ0��Ϊtrue����֮��Ȼ
lst0 = null
println lst0 ? 'lst0 true' : 'lst0 false'
lst1 = [1, 2, 3]
println lst1 ? 'lst1 true' : 'lst1 false'
lst2 = []
println lst2 ? 'lst2 true' : 'lst2 false'
