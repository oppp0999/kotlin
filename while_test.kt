fun whileLoop() {
    println("[while] 반복문")
    val items = listOf("apple", "banana", "kiwi")
    
    var index = 0
    while(index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}
/* - while문은 별다른 문법이 없이 모든언어가 좀 비슷한 모양인것 같다. for문에서는 이런 저런 키워드들이 많았는데 아직 코틀린 공홈의 Getting Started만 봐서 그런지 심플했다.

- 단순히 루프변수를 size와 비교하여 index out 할 경우 탈출한다. 마찬가지로 index로 리스트의 요소에 접근한다. */