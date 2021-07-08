

//배열은 arryyOf
//컬렉션은 list , set , map
//반복문 내부에 사용가능한 말들 step , downTo , forEachIndexed , forEach , until 등으로 조합해서 사용



//18 Class

//OOP -> Object oriented programing (객체 지향 프로그래밍)
// 축구게임 -> 필요한 객체 선수 , 심판 ,축구장 ,축구공, 관중 ,골대  등등등등등 모든것이다 객체이다.
//이러한 객체들이 모여서 서로 서로 협력하며 프로그래밍 되는게 객체지향프로그램





fun main() {


    // 인스턴스화 하기
    val bigCar =  Car("a8 engine", " big")

    val bigCar1 : Car = Car("a9 engine" , "big" )

    val superCar : SuperCar = SuperCar("z engine" , "big" , "wing")

    val runCar : RunCar = RunCar("구린앤진" , "구린바디 ")

    runCar.ride()
    runCar.navi("전주")
    runCar.run()

}


// 클래스 만드는 방법 (1)
class Car(var engine : String , var body : String){

}

// 클래스 만드는 방법 (2) 자바랑 똑같음
class SuperCar {
    var engine : String =""
    var body : String = ""
    var door : String = ""

    constructor(engine: String , body: String , door : String){
        this.engine = engine
        this.body = body
        this.door = door
    }

}

//클래스 만드는 방법 (3) -> 1번 방법의 확장  ======> 꼭 필요한것만 먼저 받을때 이렇게 사용한다.
class Car1 constructor(engine : String , body : String) {
//위 constructor 안써도 된다!!!

   var door : String = ""                                       // 이부분에 this는 꼭 필요한것 적어 주면 된다 .
    constructor( engine: String , body: String , door: String) : this (engine, body){
        //이곳은 선택사항
        this.door = door
    }

}

//클래스 만드는 방법 (4)  2번 방법의 확장
class Car2 {
    var engine : String = ""
    var body : String = ""
    var door : String = ""
    //오버로딩
    constructor(engine: String , body: String){
        this.body = body
        this.engine = engine
    }
    //오버로딩
    constructor(engine: String , body: String , door: String){
        this.engine = engine
        this.body = body
        this.door = door
    }
}

class RunCar(engine: String , body: String){

    // 객체를 만들면 무조건 출력이 되는 것이다. ★★★★★
    init {
        //초기셋팅 할 때 유용하다.
        println("런카 만들었음 ㅋㅋㅋ")
    }

   fun ride(){
       println("탑승했음")
   }
    fun run(){
        println("달립니다")
    }
    fun navi (point : String){
        println("$point (으)로 목적지설정 되었습니다.")
    }

}

//오버로딩 매개변수가 다른 같은 이름의 메소드
class TestClass() {

    fun a (a : String ){
    }
    fun b (b : Int){
    }
}


