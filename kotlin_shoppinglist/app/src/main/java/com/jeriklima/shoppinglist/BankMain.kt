package com.jeriklima.shoppinglist

fun main() {

    val deniseBankAccount = BankAccount("Denise Paola", 123.4)
    println(deniseBankAccount.accountHolder)
    deniseBankAccount.deposit(200.0)
    deniseBankAccount.withdraw(1200.0)
    deniseBankAccount.displayTransactionHistory()

}
