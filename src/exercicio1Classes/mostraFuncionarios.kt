package exercicio1Classes

fun mostraListaFuncionarios(listaFuncionarios: ArrayList<Funcionario>) {

    for (i in listaFuncionarios) {
        println("*********************")
        println("Nome: ${i.nome}")
        println("Sobrenome: ${i.sobrenome}")
        println("Horas trabalhadas: ${i.horasTrabalhadas}")
        println("Valor por hora: ${i.valorPorHora}")
    }

}