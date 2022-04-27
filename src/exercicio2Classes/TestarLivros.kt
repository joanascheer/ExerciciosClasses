package exercicio2Livros

fun main() {

    val livroFavorito:Livro = Livro("", 0, 0)


    for (i in 1..10) {
        livroFavorito.inserirLivroLista(livroFavorito.criarLivro())
    }

    livroFavorito.exibeListaLivros()
}
