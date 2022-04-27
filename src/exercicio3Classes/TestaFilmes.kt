package exercicio3Filmes

fun main() {
    val filme: Filme = Filme(
        tituloFilmeParametro = "",
        duracaoEmMinutosParametro = 0)

    for (i in 1..3) {
        filme.criaListaFilmes(filme.criaFilme())
    }
    
    filme.mostraFilmesEmCartaz()
}
