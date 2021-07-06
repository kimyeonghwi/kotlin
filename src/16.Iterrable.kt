//반복문 사용
//16. iterable

fun main() {

    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    //반복하는 방법 (1)
    for (item in a) {
        println(item)
    }

    //반복하는 방법(2)
    for ((index, item) in a.withIndex()) {
        //이렇게 하면 인덱스와 아이템 두개다 얻어올수 있다.
        println("index: $index value: $item")
    }

    //반복하는 방법(3)
    a.forEach {
        //바로 a를하나씩 출력해준다.
        println(it)
    }

    //반복하는 방법(4)
    //위 람다와 똑같은데 it만 변경해줬다
    a.forEach { item ->
        println(item)
    }
    //반복하는 방법 (5)
    a.forEachIndexed { index, item ->
        //인덱스와 같이 출력해보는 방법
        println("index: $index value: $item")
    }
    //반복하는 방법 (6)
    for (i in 0 until a.size) {
        //자바 for문에서 i++ 을 사용하는데 여기서는 자동으로 증가 한다.
        // 0부터 a의 사이즈 만큼 반복
        println(a.get(i))
    }
    //반복하는 방법 (7)
    //스탭에 적어 놓은만금 증가 하겠다.
    println()
    for (i in 0 until a.size step (2)) {
        println(a.get(i))
    }
    //반복하는 방법 (8)
    //줄어드는 형식
    println()
    for (i in a.size - 1 downTo (0)) {
        //8부터 0까지 반복
        println(a.get(i))
    }
    println()
    //반복하는 방법 (9)
    for (i in a.size -1 downTo (0) step (2)){
        println(a.get(i))
    }

    println()
    //반복하는 방법 (10)
    for (i in 0..10){
        println(i)
    }

    //반복하는 방법 (11)
    var b = 0
    var c = 4

    while (b<c){
        b++
        println("b")
    }
    var d : Int =0
    var e : Int =4
    //반복하는 방법 (11)
    do{
        println("hello")
        d++
    }while (d < e)

}

