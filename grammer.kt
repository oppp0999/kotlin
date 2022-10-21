//기본적으로 모든 내용을 테스트할 수 있는 main gkatn
fun main(){
    println(sum(10, 20))
    println(sum2(10, 20))
    printSum(10, 20)
    printSumNoUnit(10, 20)

    println("1과 10중 최댓값은 ${maxOf(1,2)}입니다.");
    println("1과 100중 최댓값은 ${maxf2(1,2)}입니다.");

    printProduct("1", "9");
    printProduct("a", "2");
    printProduct("a", "b");

    printProduct2("1", "9");
    printProduct2("a", "4");
    printProduct2("a", "b");
    
    //string_template
    string_template()
//main
}

//함수
fun main(){
    //함수 선언 2가지
    //1 -> 기본적으로 모든 프로그래밍 언어에서 봐왔듯이 평범함
    fun sum(a: Int, b: Int): Int {
        return a + b
    }


    //2 -> 괄호 생략 , return type 기재 사라짐 , 심플
    fun sum2(a: Int, b: Int) = a + b

    // Unit -> 리턴값을 반환하지 않는 표현 (void), 생략 가능
    fun printSum(a: Int, b: Int): Unit {
        println("sum of $a and $b is ${a + b}")
    }
    
    fun printSumNoUnit(a: Int, b: Int) {
        println("sum of $a and $b is ${a + b}")
    }
    
}//main

//변수 선언 세미콜론을 붙히지 않는다
fun main(){
    //1. 즉시대이
    val a: Int = 1

    //2. 즉시대입(타입체크) 이는 우측의 대입값을 보고 Int 타입으로 참조합니다.
    val b = 2

    //3. 선언 후 초기화 - 다음과 같이 선언하고나서 나중에 초기화를 해야할 때가 있는데, 그럴 때는 타입을 static 하게 정해놓고 사용해야한다.
    val c: Int
    c = 3
}

//문자열 템플릿
//- 변수 a는 문자열안에서 $기호를 붙여 값을 대입하여 사용할 수 있다.
//- 또한 ${} 안에서 문자열 s1는 자신의 인스턴스 메소드를 사용할 수 있다.
fun string_template(){
    var a = 1
    val s1 = "a is $a"
    println(s1)

    a = 2
    val s2 = "{s1.replace("is", "was")}, but now is $a" //${} 기호 안에서 메소드 접근 가능.
    println(s2)
}

//조건식 - 
fun max0f(a: Int, b:Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

//return 생략 조건식
//함수 대입식 처럼 if문에서 반환되는 값을 return 문 없이 바로 대입
fun maxf2(a: Int, b: Int) = if(a > b) a else b

//Null값과 Null 체크 -1 
//* parseInt2 함수는 str에 정수가 없다면 Null을 반환하는 함수입니다.
// - Int? 를 통해서 null 혹은 int 값이 반환 될 수 있다.
fun parseInt2(str: String): Int? {
    val numberList = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
    if(numberList.contains(str)){
        return parseInt(str)
    } else{
        return null
    }
}

//Null값과 Null 체크 -2
//null 체크는 보통 언어처럼 연선자를 이용하여 처리 가능
fun printProduct(arg1: String, arg2: String) {
    val x = parseInt2(arg1)
    val y = parseInt2(arg2)

    //
    if(x != null && y != null) {
        println(x * y)
    } else {
        println("'$arg1' or '$arg2' is not a number")
    }
}

fun printProduct2(arg1: String, arg2: String) {
    val x = parseInt2(arg1)
    val y = parseInt2(arg2)

    if(x == null) {
        println("Wrong number format in arg1: '$arg1'")
        return
    }

    if(y == null) {
        println("Wrong number format in arg1: '$arg2'")
        return
    }

    println(x * y)
}