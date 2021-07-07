fun main() {
 // first()
 // println(second(80))
   // println(third(51))
    gugudan()
}

fun first(){

    val list1 = MutableList(9 , {0})
    val list2 = MutableList(9 , {true})

    for(i in 0 until list1.size){
        list1[i] = i+1
    }
    println(list1)

    list1.forEachIndexed { index, i ->
        if(i %2 == 0 ){
            list2[index] = true
        }else{
            list2[index] = false
        }

    }
    println(list2)

}

fun second(a : Int) : String{
    //이프문
    if (a >= 90){
        return "A"
    }else if (a >= 80){
        return "b"
    }else if (a >= 70){
        return "c"
    }else {
        return "f"
    }

    //원문
    //    when(a){
//        in 90..100 -> {
//            return "a"
//        }
//        in 80..89 ->{
//            return "b"
//        }
//        in 70..79 ->{
//            return "c"
//        }
//        else -> {
//            return "f"
//        }
//
//    }

}



fun third(a : Int ) :Int {
    val b :Int = a/10
    val c :Int = a%10
    return b+c
}

fun gugudan(){

    for (i in 2..9){
        for (x in 1..9){
            println("$i x $x = ${i*x}")
        }
    }
}


//
//fun first() {
//    // 여기서도 마찮가지 9개 만들고 나머지 0으로 채움
//    val list = MutableList(9, { 0 })
//    // 사이즈 9까지 만들고 나머지 true로 채움
//    val list2 = MutableList(9, { true })
////    for (i in 0..8) {
////        list[i] = i + 1
////    }
////    println(list)
////
////    list.forEachIndexed { index, vlaue ->
////        if (vlaue % 2 == 0 ) {
////           list2[index] = true
////        } else {
////           list2[index] = false
////        }
////   }
////   println(list2)
////}
//
//    for (i in 0 until list.size) {
//        list[i] = i + 1
//    }
//    println(list)
//
//    list.forEachIndexed { index, i ->
//        if (i % 2 == 0) list2[index] = true;
//        else list2[index] = false;
//    }
//    println(list2)
//}
//
//fun second(a : Int ) : Int {
//   var b = a/10;
//   var c = a%10;
//    return b+c
//}
//
//
//fun gugudan() {
//    for (i in 1..9){
//        for (x in 1..9){
//            // 계산하고 싶을땐 딸러에 중괄호 써서 하면됨
//            println("$i x $x = ${i*x}")
//        }
//    }
//}
