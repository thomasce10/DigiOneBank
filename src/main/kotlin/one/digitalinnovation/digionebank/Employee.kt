package one.digitalinnovation.digionebank


abstract class Employee(
        name: String,
        cpf: String,
        val salary: Double)
    : People(name,cpf) {
        protected abstract fun calcBonus(): Double

        override fun toString(): String = """
            Name : $name
            Cpf: $cpf
            Salary: $salary
            Bonus: ${calcBonus()}
        """.trimIndent()
}