package exercicio1Classes

fun main() {

    println("*** Parte 1 ***\n")

    val novoFuncionario = Funcionario()

    novoFuncionario.nome = "Luis"
    novoFuncionario.sobrenome = "Silva"
    novoFuncionario.valorPorHora = 25.5
    novoFuncionario.horasTrabalhadas = 10

    novoFuncionario.nomeCompleto()
    novoFuncionario.calcularSalario()

    novoFuncionario.incrementarHorasTrabalhadas(8)
    novoFuncionario.calcularSalario()

    println("*** Parte 2 ***\n")

    val listaFuncionarios = ArrayList<Funcionario> ()

    criaFuncionarios(listaFuncionarios)
    mostraListaFuncionarios(listaFuncionarios)

}








