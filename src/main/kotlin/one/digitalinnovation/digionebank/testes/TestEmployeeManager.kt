package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Manager
import one.digitalinnovation.digionebank.Employee

fun main(){
    val helen = Manager("Helen Penn", "032.123.444.31", 5400.00)

    //println("Employee: " + thomas.name + "\nCPF: " + thomas.cpf + "\nSalary: " + 5400.00)
    ShowEmployee.show(helen)
}
