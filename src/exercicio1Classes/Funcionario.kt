package exercicio1Classes

class Funcionario {
    var nome = ""
    var sobrenome = ""
    var horasTrabalhadas = 0
    var valorPorHora = 0.0

    fun nomeCompleto() {
        println("Nome completo: $nome $sobrenome")
    }

    fun calcularSalario() {
        val salario = horasTrabalhadas * valorPorHora
        println("Salário: R$$salario")
    }

    fun incrementarHorasTrabalhadas(horas: Int) {
        println("São $horas horas trabalhadas a mais")
        horasTrabalhadas += horas
    }
}

