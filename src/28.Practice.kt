


//28. 인터페이스
//- 인터페이스도 구현이 있는 함수를 만들수 있다.
//- 인터페이스에 구현이 있는 함수는 그 인터페이스를 구현 하는 클래스에서 그 함수를 구현할 필요가 없다.
//- 인터페이스에 구현이 없느 함수는 그 인터페이스를 구현 하는 클래스에서 그 함수를 반듯이 구현해야 한다.
fun main(){
    val student_ : Student_ = Student_()
    student_.sleep()
    student_.eat()
}


interface  Person_{
    fun eat(){
        println("먹는다.")
    }
    //앱스트랙 추상 메소드
    abstract fun sleep()

    abstract fun study()
}



class Student_ : Person_{

    override fun sleep() {
        TODO("Not yet implemented")
    }

    override fun study() {
        TODO("Not yet implemented")
    }
}

class Teacher_ : Person_{

    override fun sleep() {
        TODO("Not yet implemented")
    }

    override fun study() {
        TODO("Not yet implemented")
    }
}