fun forLoop(){
    println("[for] 반복문")
    val items = listOf("apple", "banana", "kiwi")
    
    // A
    for(item in items) {
        println(item)
    }
    // B
    for(index in 0..(items.size-1)) {
        println("이건 item at $index is ${items[index]}")
    }
    // C
    for(index in 0 until items.size) {
        println("이건 item at $index is ${items[index]}")
    }
    // D
    for(index in items.indices) { //indices -> 0..2
        println("item at $index is ${items[index]}")
    }
}

/* - listOf는 자바의 Arrays.asList() 함수처럼 String 값들을 배열로 만들어주는 함수입니다.

- A의 형태는 익히 알고계시겠지만 자바의 향상된 Foreach문처럼 items 객체를 하나씩 item에 담아서 도는 for문.

- B의 형태는 0부터 items의 size-1 즉 마지막 인덱스까지 루프를 돌리는 것이다. 실제로 별로 좋은 모습은 아니어서  아래로 변형하여 쓴다.

- C의 형태는 0부터 size까지 즉, B타입의 표현이 어색하기 때문에 until이라는 키워드를 붙인 것이다. 하지만 이 역시 아래의 D 표현으로 사용되는걸 권장한다.

- D의 형태에서 list는 indices라는 IntRange 타입의 값을 반환하는데 0..2 가 들어있다. 즉, items의 최소인덱스..최대인덱스 이다.

- 특별한 키워드를 따로 쓸 필요없이 indices를 제공하므로 in절에다가 써주면 단순 포문처럼 돌아간다. */