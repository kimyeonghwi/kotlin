

// 14 Collection
// 많이 사용하는 3가지 list , set, map

fun main(args: Array<String>){

    // Immutable Collections 값 변경이 불가능한 컬렉션

    // list -> 중복을 허용 한다
    val numberList = listOf<Int>(1,2,3)
    println(numberList)
    println(numberList.get(0))
    println(numberList[0])
    //set -> 중복을 허용하지 않는다.
    //    -> 순서가 없다.
    val numberSet = setOf<Int>(1,2,3,3,3)
    println()
    numberSet.forEach {
        println(it)
    }
    //map -> key,value 방식으로 관리한다.
    val numberMap = mapOf<String ,Int>("one" to 1, "two" to 2 )
    println()
    println(numberMap.get("one"))




    //Mutable Collections 값 변경가능

    // Mutable list
    val mNumberList  = mutableListOf<Int>(1,2,3)
    mNumberList.add(3,4)
    println(mNumberList)

    // Mutable set
    val mNumberSet = mutableSetOf<Int>(1,2,3,4,4,4)
    mNumberSet.add(10)
    println(mNumberSet)

    // Mutable Map
    val mNumberMap = mutableMapOf<String , Int>("one" to 1 , "two" to 2)
    mNumberMap.put("Three" , 3)
    println(mNumberMap)
}