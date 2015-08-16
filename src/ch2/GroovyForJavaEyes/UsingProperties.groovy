Calendar.instance
//代替Calendar.getInstance()

str = 'hello'

str.class.name
//代替str.getClass().getName()
//注意：不能用于Map、Builder等类型
//为保险起见，请使用str.getClass().name