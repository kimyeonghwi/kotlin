

//같은 기능이 2번까지는 괜찮다
//두번이상 넘어가면 리펙토링(정리정돈) 해라

//같은 기능을 여러번 사용하는것을 막는다 .

fun main(array: Array<String>){

    val monster : SuperMonster = SuperMonster(100,10)
    val night : SuperNight = SuperNight(130, 8)
    monster.attack(night)
    monster.bite(night)
}

//상속이 만들어낸 특징
//- 자식 클래스는 부모클래스의 타입니다.
//- 부모 클래스는 자식클래스의 타입이 아니다!

open class Charator(var hp: Int , val power : Int ) {
    fun attack(charator: Charator, power: Int = this.power){
        charator.defense(power)
    }
    open fun defense(damage : Int ){
        hp-=damage
        if(hp>0) println("${javaClass.simpleName}의 남은체력 $hp")
        else println("사망했습니다.")
    }
}

//자식이 인스턴스화 되기 위해서 부모 클래스 선행되서 인스턴스화 되어야 한다.
class SuperMonster(hp: Int , power: Int): Charator(hp,power){
    fun bite(charator: Charator){
        super.attack(charator, power+2)
    }
}
class SuperNight(hp: Int , power: Int): Charator(hp,power){
    val defensePower = 2
    override fun defense(damage: Int) {
        super.defense(damage - defensePower)
    }
}