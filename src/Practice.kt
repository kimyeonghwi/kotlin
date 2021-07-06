

fun main (array: Array<String>){
    //중복허용
    val a = mutableListOf<Int>(1,2,3)
    a.add(4)
    println(a)
    // add 기존에 있던 인덱스에 값을 넣게되면 옆으로 밀리고 값이 들어간다.
    a.add(0,100)
    println(a)

    // set 기존인덱스 값을 변경한다 .
    a.set(0,200)
    println(a)

    //해당인덱스 값 삭제
    a.removeAt(1)
    println(a)

    //중복허용 안함
    val b = mutableSetOf<Int>(1,2,3,4,)
    println()
    b.add(2)
    println(b)
    //set은 해당값을 지워준다 .
    b.remove(2)
    //없는 값을 넣어도 무관하다.
    b.remove(100)
    println(b)


    //키와 값
    val c = mutableMapOf<String ,Int>("원" to 1)
    println()
    //값 넣어주기
    c.put("two", 2)
    println(c)
    //해당 키에 값 변경 해주기
    c.replace("two" , 3)
    //키만 보기
    println(c.keys)
    //모두 보기
    println(c.values)
    //전부 삭제하기
    c.clear()
    println(c)




}
