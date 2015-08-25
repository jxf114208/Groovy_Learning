/**
 * ���ﻯ�հ�
 * 
 * �հ����ܲ������κ��βΣ�Ҳ���ܽ��ܶ���βΡ�ÿ�ε���һ���հ�ʱ��������������Ϊ��ÿһ���βδ�����Ӧ��ʵ�Ρ�Ȼ��
 * ����ڶ�ε���֮�䣬��һ�����߶��ʵ������ͬ�ģ����ξͻ��ÿ��﷦ζ��Ԥ�Ȱ�һЩ�հ��βο��Ի�������ʹ�ࡣ
 * 
 * ����Ԥ���βεıհ��������ﻯ�հ���Curried Closure��
 * 
 * ����һ���հ�����curry����ʱ������Ҫ��Ԥ�Ȱ�ĳЩ�βΡ���Ԥ�Ȱ���һ���β�֮�󣬵��ñհ�ʱ�Ͳ����ظ�Ϊ
 * ����β��ṩʵ���ˡ�
 * 
 * ʹ��curry()�������ﻯ�������βΣ�����Щ�βα����Ǵ�ǰ�濪ʼ���������ɸ���Ҳ����˵�������n���βΣ����ǿ���������ﻯǰk�������� 0 <= k <= n
 * 
 * �������ﻯ������βΣ�����ʹ��rcurry������
 * �������ﻯ�β��б��м���βΣ�����ʹ��ncurry()����������Ҫ���п��ﻯ���βε�λ�ã�ͬʱ�ṩ��Ӧ��ֵ
 */
package ch4.UsingClosures

def tellFortunes(closure) {
	date = new Date("09/20/2012")
	closure date, "You day is filled with ceremony"
	closure date, "They're features, not bugs"
	//����ͨ�����ﻯ�����ظ�����date
	postFortune = closure.curry(date)
	postFortune "You day is filled with ceremony"
	postFortune "They're features, not bugs"
}

tellFortunes {date, fortune ->
	println "Fortune for $date is '$fortune'"
}
