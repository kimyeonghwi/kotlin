

fun main(){

    val math = Math()
    println(math.aaa(1 ,2)) // 3
    println(math.bbb(5 ,2)) // 3
    println(math.ccc(2 ,2)) // 4
    println(math.ddd(10 ,2)) // 5


    println()

    val bank = Bank("아옳이 계좌 " , "1991-05-23")
    bank.add(1000)
    bank.minus(500)
    bank.showMoney()

    println()
    val tv = Tv (listOf("K","M","S"))
    tv.turn()
    println(tv.onOrOff)
    tv.turn()
    println(tv.onOrOff)
    tv.turn()
    println(tv.onOrOff)
    tv.changeup()
    tv.changeup()
    tv.changeup()
    tv.changeup()


}

class Math(){

    fun aaa(a : Int , b : Int ): Int{
        return a+b
    }
    fun bbb(a : Int , b : Int ): Int{
        return a-b
    }
    fun ccc(a : Int , b : Int ): Int{
        return a*b
    }
    fun ddd(a : Int , b : Int ): Int{
        return a/b
    }

}


class Bank(name : String , birth : String){

    var money : Int = 0

    init {
        println("$name 님의 계좌가 생성되었습니다.")
    }
    fun showMoney(){
        println("$money 만큼 돈있어용")
    }
    fun add(a : Int){
        money+= a
        println("$a 만큼 입금했음")
    }
    fun minus(a : Int){
        money-= a
        println("$a 만큼 출금했음")
    }
}

class Tv (val chnel : List<String>){

    var onOrOff : Boolean = false
    var current = 0
        set(value) { // set메소드로  그위에 있는 변수의 변화를 감지한다.
            field = value
            if(field>2){
                field = 0
            }
            if(field<0){
                field = 2
            }
        }

//커런트에 1이 들어가면 벨루도 1이 들어감 set은 값이 할당될때 , get은 값이 불려나갈떄

    fun turn (){
       onOrOff = !onOrOff
    }

    fun check():String {
        return chnel[current]
    }
    fun changeup () {
        current = current +1
    }
    fun changdown () {
        current = current -1
    }
}