package exercicio3Classes

fun mostraListaDeFilmes(listaFilmes: ArrayList <Filme>) {

    println("*** Lista de Filmes ***\n")
    listaFilmes.forEach {
        it.titulo
        it.duracaoEmMinutos
        exibirDuracaoEmHoras(it.titulo, it.duracaoEmMinutos)
        println("************")
    }

}