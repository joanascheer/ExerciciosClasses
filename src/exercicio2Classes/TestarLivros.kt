package exercicio2Classes

fun main() {
    val livroFavorito = Livro ()

    livroFavorito.titulo = "O Pequeno Príncipe"
    livroFavorito.qtdPaginas = 98
    println("O Livro ${livroFavorito.titulo} possui ${livroFavorito.qtdPaginas} páginas.")
    livroFavorito.paginasLidas = 20

    verificarProcesso(livroFavorito.qtdPaginas, livroFavorito.paginasLidas)

    livroFavorito.paginasLidas = 50
    verificarProcesso(livroFavorito.qtdPaginas, livroFavorito.paginasLidas)

    val livro1 = Livro ()
    livro1.titulo = "O Pacto dos Ancestrais"
    livro1.qtdPaginas = 10
    livro1.paginasLidas = 5
    println("Livro 1: ${livro1.titulo}")
    verificarProcesso(livro1.qtdPaginas, livro1.paginasLidas)
    println("*************\n")

        val livro2 = Livro ()
    livro2.titulo = "O rio Subterrâneo"
    livro2.qtdPaginas = 20
    livro2.paginasLidas = 6
    println("Livro 1: ${livro2.titulo}")
    verificarProcesso(livro2.qtdPaginas, livro2.paginasLidas)
    println("*************\n")

        val livro3 = Livro ()
    livro3.titulo = "Transformadores De Consciência"
    livro3.qtdPaginas = 30
    livro3.paginasLidas = 20
    println("Livro 1: ${livro3.titulo}")
    verificarProcesso(livro3.qtdPaginas, livro3.paginasLidas)
    println("*************\n")

        val livro4 = Livro ()
    livro4.titulo = "História meio ao contrário"
    livro4.qtdPaginas = 40
    livro4.paginasLidas = 10
    println("Livro 1: ${livro4.titulo}")
    verificarProcesso(livro4.qtdPaginas, livro4.paginasLidas)
    println("*************\n")

        val livro5 = Livro ()
    livro5.titulo = "O olhar"
    livro5.qtdPaginas = 50
    livro5.paginasLidas = 20
    println("Livro 1: ${livro5.titulo}")
    verificarProcesso(livro5.qtdPaginas, livro5.paginasLidas)
    println("*************\n")

        val livro6 = Livro ()
    livro6.titulo = "Além Da Parapsicologia"
    livro6.qtdPaginas = 60
    livro6.paginasLidas = 60
    println("Livro 1: ${livro6.titulo}")
    verificarProcesso(livro6.qtdPaginas, livro6.paginasLidas)
    println("*************\n")

        val livro7 = Livro ()
    livro7.titulo = "O Senhor dos Anéis"
    livro7.qtdPaginas = 70
    livro7.paginasLidas = 50
    println("Livro 7: ${livro7.titulo}")
    verificarProcesso(livro7.qtdPaginas, livro7.paginasLidas)
    println("*************\n")

        val livro8 = Livro ()
    livro8.titulo = "Harry Potter"
    livro8.qtdPaginas = 80
    livro8.paginasLidas = 33
    println("Livro 8: ${livro8.titulo}")
    verificarProcesso(livro8.qtdPaginas, livro8.paginasLidas)
    println("*************\n")

        val livro9 = Livro ()
    livro9.titulo = "Nosso Lar"
    livro9.qtdPaginas = 90
    livro9.paginasLidas = 21
    println("Livro 9: ${livro9.titulo}")
    verificarProcesso(livro9.qtdPaginas, livro9.paginasLidas)
    println("*************\n")

        val livro10 = Livro ()
    livro10.titulo = "Acabou a Criatividade"
    livro10.qtdPaginas = 100
    livro10.paginasLidas = 90
    println("Livro 10: ${livro10.titulo}")
    verificarProcesso(livro10.qtdPaginas, livro10.paginasLidas)
    println("*************\n")

}