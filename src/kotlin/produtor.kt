import kotlin.random.Random

fun produzirDados(): List<Int> {
    val dados = List(100) {
        Random.nextInt(0, 111)
    }

    return dados
}

fun principal() {
    val dados = produzirDados()
    println(dados.joinToString(separator = ","))
}

fun main() {
    principal()
}