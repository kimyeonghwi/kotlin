fun main() {
  //  first()
  //  println(second(51))
  //  println(third(89))
  //  gugudan()
}

fun first() {
    // 여기서도 마찮가지 9개 만들고 나머지 0으로 채움
    val list = MutableList(9, { 0 })
    // 사이즈 9까지 만들고 나머지 true로 채움
    val list2 = MutableList(9, { true })
//    for (i in 0..8) {
//        list[i] = i + 1
//    }
//    println(list)
//
//    list.forEachIndexed { index, vlaue ->
//        if (vlaue % 2 == 0 ) {
//           list2[index] = true
//        } else {
//           list2[index] = false
//        }
//   }
//   println(list2)
//}

    for (i in 0 until list.size) {
        list[i] = i + 1
    }
    println(list)

    list.forEachIndexed { index, i ->
        if (i % 2 == 0) list2[index] = true;
        else list2[index] = false;
    }
    println(list2)
}

fun second(a : Int ) : Int {
   var b = a/10;
   var c = a%10;
    return b+c
}


fun gugudan() {
    for (i in 1..9){
        for (x in 1..9){
            // 계산하고 싶을땐 딸러에 중괄호 써서 하면됨
            println("$i x $x = ${i*x}")
        }
    }
}
