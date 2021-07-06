



fun main(array: Array<String>) {
    var array = arrayOf<Int>(1, 2, 30)

    var number = array.get(0)
    println(number)
    //  아래 인덱스 넘어가면 나오는 오류 ArrayIndexOutOfBoundsException
    //  val number1 = array.get(100)

    array.set(0, 100)
    val number2 = array.get(0)
    println(number2);

    //  아래 인덱스 넘어가면 나오는 오류 ArrayIndexOutOfBoundsException
    // 100번인덱스 없음
    //  array.set(100,100)

    // Array의 Bounds 는 처음 만들때 결정된다.

    //Array를 만드는 방법 (3)
    val a1 = intArrayOf(1, 2, 3)
    val a2 = charArrayOf('b', 'b')
    val a3 = doubleArrayOf(1.2, 100.35)
    val a4 = booleanArrayOf(true,false)

    //Array를 만드는 방법 (4) -> 람다활용한 방법

    //이렇게 작성하게 되면 사이즈 10인것이 만들어 지고 나머지 값들을 0으로 들어가게된다 .
    var a5 = Array(10, { 0 }) //
    var a6 = Array(5,{1;2;3;4;5 }) //
}