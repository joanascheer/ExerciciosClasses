package exercicio3Filmes

class Filme (
    tituloFilmeParametro: String,
    duracaoEmMinutosParametro: Int
) {
    var tituloFilme = tituloFilmeParametro
    var duracaoEmMinutos = duracaoEmMinutosParametro

    val listaDeFilmes: ArrayList <Filme> = ArrayList()

    fun exibirDuracaoEmHoras() {
        var duracaoEmHoras = duracaoEmMinutos / 60
        var restoMinutos = duracaoEmMinutos % 60

        println("O filme $tituloFilme tem $duracaoEmHoras horas e $restoMinutos minutos.")
    }

    fun criaFilme(): Filme {

        println("Qual o nome do filme?")
        tituloFilme = readln()

        println("Qual a sua duração em minutos?")
        duracaoEmMinutos = readln().toInt()

        return Filme(
            tituloFilmeParametro = tituloFilme,
            duracaoEmMinutosParametro = duracaoEmMinutos
        )
    }

    fun criaListaFilmes(filme: Filme) {
        listaDeFilmes.add(filme)
    }


    fun mostraFilmesEmCartaz() {
        println("*** Em cartaz: ***\n")

        listaDeFilmes.forEach {
            it.exibirDuracaoEmHoras()
        }
    }
}
