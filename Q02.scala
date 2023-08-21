@main def Question_02: Unit ={
    val x = new Rational_Q2(3, 4)
    val y = new Rational_Q2(5, 8)
    val z = new Rational_Q2(2, 7)

    val result = x.sub(y).sub(z)

    println(s"x: $x")
    println(s"y: $y")
    println(s"z: $z")
    println(s"Result of x - y - z: $result")
}

class Rational_Q2(n: Int, d: Int) {
    private 
        val numerator: Int = n
        val denominator: Int = d

    def neg: Rational_Q2 = new Rational_Q2(-numerator, denominator)

    def sub(that: Rational_Q2): Rational_Q2 = {
        new Rational_Q2(
        numerator * that.denominator - that.numerator * denominator,
        denominator * that.denominator
        )
    }
    override def toString: String = s"$numerator / $denominator"
}