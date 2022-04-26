package exercicio3Classes

fun exibirDuracaoEmHoras(titulo: String, duracaoEmMinutos: Int) {
    val duracaoHoras = duracaoEmMinutos / 60
    val minutosRestantes = duracaoEmMinutos % 60
    println("O filme $titulo possui $duracaoHoras horas e $minutosRestantes minutos.")
}