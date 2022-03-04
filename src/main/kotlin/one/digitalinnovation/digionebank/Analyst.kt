package one.digitalinnovation.digionebank


class Analyst(name: String, cpf: String, salary: Double) : Employee(name, cpf, salary) {
    override fun calcBonus() = salary * 0.1
}