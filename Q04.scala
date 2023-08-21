
    @main def Question_04: Unit ={
    val account_Q41 = new Account_Q4(1000.0)
    val account_Q42 = new Account_Q4(-500.0)
    val account_Q43 = new Account_Q4(200.0)
    
    val bank: List[Account_Q4] = List(account_Q41, account_Q42, account_Q43)

    println("Account_Q4s with negative balances:")
        val negativeBalance = bank.filter(account_Q4 => account_Q4.getBalance < 0)
        negativeBalance.foreach(account_Q4 => println(account_Q4))

    val sumOfBalances = bank.map(_.getBalance).sum
        println(s"Sum of all account_Q4 balances: $sumOfBalances")

    println("Final balances after applying interest:")
        bank.foreach(account_Q4 => {
        account_Q4.applyInterest()
        println(account_Q4)
        })
  }

class Account_Q4(private var balance: Double) {
    def getBalance: Double = balance

    def deposit(amount: Double): Unit = {
        if (amount > 0) {
            balance += amount
            println(s"Deposited $amount. New balance: $balance")
        } else {
            println("Invalid deposit amount.")
        }
    }

    def withdraw(amount: Double): Unit = {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println(s"Withdrew $amount. New balance: $balance")
        } else {
            println("Invalid withdrawal amount or insufficient balance.")
        }
    }

    def transfer(amount: Double, toAccount_Q4: Account_Q4): Unit = {
        if (amount > 0 && amount <= balance) {
            withdraw(amount)
            toAccount_Q4.deposit(amount)
            println(s"Transferred $amount from this account_Q4 to the target account_Q4.")
        } else {
            println("Invalid transfer amount or insufficient balance.")
        }
    }

    def applyInterest(): Unit = {
        val interestRate = if (balance >= 0) 0.05 else 0.1
        val interest = balance * interestRate
        balance += interest
        println(s"Applied interest. New balance: $balance")
    }

    override def toString: String = s"Account_Q4 balance: $balance"
}