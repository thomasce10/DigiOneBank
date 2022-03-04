package one.digitalinnovation.digionebank

class Manager(name: String, cpf: String, salary: Double) : Employee(name, cpf, salary){
    override fun calcBonus(): Double = salary * 0.4
}