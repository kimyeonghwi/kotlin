
// 12배열

// 배열이 필요한 이유
//- 그룹(모음집)이 필요할때
fun main(array: Array<String>){

    var one : Int = 1
    var tow : Int = 2
    var three : Int = 3
    var four : Int = 4
    var five : Int = 5

    //배열 생성 방법(1)
    //인트만 들어가는 배열
    var group1 = arrayOf<Int>(1,2,3,4,5,)
    println(group1 is Array)

    //배열 생성 방법(2)
    //여러가지의 타입이 들어가는 배열
    var group2 = arrayOf(1,2, 3.5,"hello")

    //Index란
    //순서를 나타낸다
    // [1,2,3,4,5] 이런 상태에서 0부터 시작

    //배열의 값을 꺼내는 방법 (1)
    val test1 = group1.get(0)
    val test2 = group1.get(4)
    println(test1)
    println(test2)

    //배열의 값을 꺼내는 방법 (2)
    var test3 = group1[1]
    println(test3)

    //배열 값 바꾸는 방법 (1)
    group1.set(0,100)
    println(group1.get(0))

    //배열 값 바꾸는 방법 (2)
    group1[0] = 200
    println(group1.get(0))

}