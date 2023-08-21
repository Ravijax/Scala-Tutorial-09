@main def Question_01: Unit ={
    val x = new Rational(3, 4)
    val neg_X = x.neg

    println(s"x: $x")
    println(s"Negative x: $neg_X")
}

class Rational(n: Int, d: Int) {
    private
        val numerator: Int = n 
        val denominator: Int = d 

    def this(n: Int) = this(n, 1)

    def neg: Rational = new Rational(-numerator, denominator)
    override def toString: String = s"$numerator / $denominator"
}