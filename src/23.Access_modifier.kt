

//23. 접근 제어자


fun main(array: Array<String>){

    val testAccess :TestAccess = TestAccess("아무개")
    //private 는 외부에서 접근 불가능 하다 .

    // testAccess.test()

   /* println(testAccess.name)
    testAccess.name = "아무개2"
    println(testAccess.name)*/

    val reward :Reward = Reward()
    reward.rewardAmount = 2000

}

class  Reward(){
    var rewardAmount : Int = 1000
}

class TestAccess{
   private var name : String = "홍길동"

    constructor(name: String){
        this.name = name
    }

    fun changeName(newName : String ){
        this.name = newName
    }
    private fun test(){
        println("테스트")
    }
}