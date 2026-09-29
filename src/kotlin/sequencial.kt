import kotlin.random.Random

fun produzirDados(): List<Int> {
    val dados = List(100) {
        Random.nextInt(0, 111)
    }

    return dados
}

fun consumirDados(dados: List<Int>) {
    val resultado = dados.sum()
    println("recebeu -> $resultado")
}

fun principal() {
    println("iniciou")

    val dados = produzirDados()
    consumirDados(dados)

    println("finalizou")
}

fun main() {
    principal()
}