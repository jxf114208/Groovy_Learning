package ch2.GroovyForJavaEyes

int[] arr = [1, 2, 3, 4]

println arr
println "class is ${arr.getClass().name}"

//ʹ��as����������
def arr2 = [1, 2, 3, 4] as int[]

println arr2
println "class is ${arr2.getClass().name}"