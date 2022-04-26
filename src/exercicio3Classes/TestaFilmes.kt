package exercicio3Classes


fun main() {

    val filme1 = Filme()
    filme1.titulo = "Os Vingadores"
    filme1.duracaoEmMinutos = 142

    exibirDuracaoEmHoras(filme1.titulo, filme1.duracaoEmMinutos)

    val filme2 = Filme()
    filme2.titulo = "Hotel Transilvânia"
    filme2.duracaoEmMinutos = 93

    exibirDuracaoEmHoras(filme2.titulo, filme2.duracaoEmMinutos)

    println("Os filmes em cartaz são ${filme1.titulo} e ${filme2.titulo}\n")

    val listaFilmes = ArrayList <Filme> ()

    criaListaDeFilmes(listaFilmes)

}



