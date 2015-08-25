/**
 * �հ���Э��
 * 
 * ����һ�������򷽷����ڳ����ִ�������д���һ���µ����������ǻ���һ����ڵ㣨��������������)���뺯�����ڷ�����ɺ󣬻ص������ߵ�������
 * 
 * Э����֧�ֶ����ڵ㣬ÿ����ڵ㶼���ϴι�����õ�λ��
 */
package ch4.UsingClosures

def iterate(n, closure) {
	1.upto(n) {
		println "In iterate with vlaue $it"
		closure(it)
	}
}

println "Calling iterate"
total = 0
iterate(4) {
	total += it
	println "In closure total so far is $total"
}
println "Done"
