package exercicio3Classes

fun criaListaDeFilmes(listaFilmes: ArrayList <Filme>) {

    val filme3 = Filme()
    val filme4 = Filme()
    val filme5 = Filme()
    val filme6 = Filme()
    val filme7 = Filme()
    listaFilmes.add(filme3)
    listaFilmes.add(filme4)
    listaFilmes.add(filme5)
    listaFilmes.add(filme6)
    listaFilmes.add(filme7)

    filme3.titulo = "Nightmare on Elm Street 8"
    filme3.duracaoEmMinutos = 150
    filme4.titulo = "Child's Play"
    filme4.duracaoEmMinutos = 100
    filme5.titulo = "I.T"
    filme5.duracaoEmMinutos = 180
    filme6.titulo = "Shinning"
    filme6.duracaoEmMinutos = 200
    filme7.titulo = "Nightmare Before X-Mas"
    filme7.duracaoEmMinutos = 80

    mostraListaDeFilmes(listaFilmes)
}