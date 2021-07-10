

//29.Generic (제너릭)
// 목적 : 다양한 타입의 객체들을 다루는 메서드나(함수) 컬렉션(리스트등등)
//        클래스에서 타입을 컴파일시에 타입을 결정하는 기능
//        팩트 : 타입을 체크하는 기능

// - 제너릭은 만들기 어렵고 실제로 만들일 거의 없기 때문에 사용법만 숙지한다.

fun main(args: Array<String>){

    //제너릭 사용하지 않은경우
    //형 변환을 해줘야 한다.
    val list1 = listOf(1,2,3,"가")
    val b : String = list1[2].toString() // 형변환(타입변경)

    //제너릭을 사용하는 경우 -> 타입이 안전하다
    val list2 = listOf<String>("1","2","3")
    var c : String = list2[2]//String 이라는것을 보장 받는다 .

    //강한 타입을 체크 할수 있다.
    val list3 = listOf(1,2,3,4,"가","나",3.0)
 //    val list4 = listOf<Int>(1,2,3,4,"가") // 이렇게 하면 안들어감

    //제너릭을 사용하지 않은 경우
    val list5 = listOf<Any>(1,2,3,"가")// -> Any라는 타입으로 변경된다. 자바에서 object 타입과 같은건가 보다 ㅋㅋ
    //부모 : Any
    //자식 : String , Int , Float

}


