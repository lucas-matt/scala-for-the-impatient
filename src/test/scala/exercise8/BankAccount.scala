package exercise8

class BankAccount(initialBalance: Double) {

  protected var _balance = initialBalance

  def deposit(amount:Double) = {
    _balance += amount
    _balance
  }

  def withdraw(amount:Double) = {
    _balance -= amount
    _balance
  }

  def balance = {
    _balance
  }

}
