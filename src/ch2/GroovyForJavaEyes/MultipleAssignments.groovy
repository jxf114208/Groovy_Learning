/**
 * ʹ�öำֵ
 */

def splitName(fullName) { fullName.split(' ') }

def (firstName, lastName) = splitName("James Bond")
println "$lastName, $firstName $lastName"

//��������ֵ
def name1 = "Thomson", name2 = "Thompson"
println "$name1 and $name2"
(name2, name1) = [name1, name2]
println "$name1 and $name2"

//����������ֵ����Ŀ��ƥ��ʱ��GroovyҲ�������ŵĴ���
//����ж���ı�����Groovy�Ὣ��������Ϊnull
def (String cat, String mouse) = ['Tom', 'Jerry', 'Spike', 'Tyke']
println "$cat and $mouse"

//�����ֵ�ᱻ����
def (first, second, Integer thrid) = ['Tom', 'Jerry']
println "$first, $second, and $thrid"
