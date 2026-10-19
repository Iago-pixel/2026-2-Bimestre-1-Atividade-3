import kotlin.random.Random
fun consumirDados(dados: List<Int>) {
    val resultado = dados.sum()
    println("recebeu -> $resultado")
}

fun principal() {
    println("iniciou")

    val dados_em_texto = readln()
    val dados: List<Int> = dados_em_texto
        .split(",")
        .map { it.toInt() }

    consumirDados(dados)

    println("finalizou")
}

fun main() {
    principal()
}