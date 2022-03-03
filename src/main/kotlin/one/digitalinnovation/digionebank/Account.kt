package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Account( val bankBranch: String, val accountNumber: String, val balance: BigDecimal){

    fun deposit(value: BigDecimal){}
    fun withdraw(value: BigDecimal){}
}

