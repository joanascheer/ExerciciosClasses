package exercicio2Classes

fun verificarProcesso(qtdPaginas: Int, paginasLidas: Int) {
    val porcentagem = paginasLidas * 100 / qtdPaginas
    println("$porcentagem% do livro foi lido.")
}