package exercicio2Livros

class Livro (
    tituloParametro: String,
    qtdePaginasParametro: Int,
    paginasLidasParametro: Int
        ) {
    var titulo = tituloParametro
    var qtdePaginas = qtdePaginasParametro
    var paginasLidas = paginasLidasParametro

    val listaLivros: ArrayList<Livro> = ArrayList()

    fun verificarProgresso() : Int {
        return (paginasLidas * 100) / qtdePaginas
    }

    fun exibeMensagem() {
        println("$titulo tem $qtdePaginas páginas.")
        println("Você já leu ${verificarProgresso()}% do livro.")
    }

    fun criarLivro(): Livro {

        println("Qual o título do livro?")
        val tituloLivro = readln()

        println("Quantas páginas tem este livro?")
        val qtdePaginasLivro = readln().toInt()

        println("Quantas páginas você já leu?")
        val paginasLidasLivro = readln().toInt()

        return Livro(
            tituloParametro = tituloLivro,
            qtdePaginasParametro = qtdePaginasLivro,
            paginasLidasParametro = paginasLidasLivro
        )
    }

    fun inserirLivroLista(livro: Livro) {
        listaLivros.add(livro)
    }

    fun exibeListaLivros() {
        println("*** Estante de livros ***\n")

        listaLivros.forEach {
            it.exibeMensagem()
        }
    }
}
