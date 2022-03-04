package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analyst
import one.digitalinnovation.digionebank.Employee

fun main(){
    val thomas = Analyst("Thomas Kevin", "054.786.111.90", 5400.00)

    //println("Employee: " + thomas.name + "\nCPF: " + thomas.cpf + "\nSalary: " + 5400.00)
    ShowEmployee.show(thomas)
}

