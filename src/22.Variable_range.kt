

//1. 전역 변수
//2. 지역 변수

// 선언한곳에 따라서 접근할 수있는 영역이 다르다.
// 메소드내부에 선언하면 그 메소드 내부만
// 클래스내부라면 클래스 내부만
// 전역이라면 어디서든지 사용가능하다.


var number100 : Int = 10

fun main (array: Array<String>){
    println(number100)

    val test = Test("홍길동")
    test.testFun()
    test.name
    println(number100)
}

class Test(var name: String){

     //메소드 내부에 선언한 gender 변수는 메소드 내부에서만 사용가능
     //고로 클래스에서는 사용불가 하지만
    // 메소드도 클래스 내부에 있기때문에 클래스에 있는 변수는 접근가능
    fun testFun(){
        val gender : String = "남자"
        name = "홍길동" // 클래스가 가지고 있는 변수 그래서 접근가능
        number100 = 100 // 전역변수 그래서 접근가능

    }

}