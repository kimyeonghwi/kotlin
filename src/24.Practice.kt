


//선생님 말씀 !
//뭔가를 만들때는 무조건 작은 범위에서 사용하도록 설정하면된다.
//즉 처음 val로 만들고 나중에 변경을 해야한다면 var로 변경
//무조건 private 붙여서 만들고 나중에 사용해야된다면 지워서 사용하는 습관을 들이자.

fun main(array: Array<String>){

    val night = Night(20,4)
    val monster = Monster(15,5)

    night.attack(monster)
    monster.attack(night)


}
//프라이빗 키워드 사용하여 막아주었다.
class Night(private var hp : Int , private var power : Int ){

    fun attack(monster: Monster){
        monster.defense(power)
    }
    fun defense(damage: Int){
        hp -=damage
        if(hp > 0 ){
            heal()
            println("기사 현재 체력은 $hp 입니다.")
        }
        else ("기사가 죽었습니다.")
    }
    private fun heal(){
        //힐의 사용조건은 공격을 당했을때 살았을경우만 사용하는 조건이라
        // 여기에 private 걸어주면 다른곳에서 이걸 사용 못한다.
        hp +=3
    }

}



class Monster(var hp : Int , var power: Int){

    fun attack(night: Night){
        night.defense(power)
    }
    fun defense(damage: Int){
        hp -= damage
        if(hp > 0 )println("몬스터 현재 체력은 $hp 입니다.")
        else ("몬스터가 죽었습니다.")
    }

}