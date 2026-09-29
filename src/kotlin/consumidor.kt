import kotlin.concurrent.thread
import kotlin.random.Random

var dados = mutableListOf<Int>()

fun produzirDados() {
    println("# produzir - iniciado")
    dados = List(100) { Random.nextInt(0, 111) }.toMutableList()
    println("# produzir $dados")
    println("# produzir - terminado")
}

fun consumirDados() {
    println("### consumir - iniciado")
    println("### dados -> $dados")
    val resultado = dados.sum()
    println("### resultado -> $resultado")
    println("### consumir - terminado")
}

fun principal() {
    println("iniciou")

    val threadProdutor = thread {
        produzirDados()
    }

    val threadConsumidor = thread {
        consumirDados()
    }

    threadProdutor.join()
    threadConsumidor.join()

    println("finalizou")
}

fun main() {
    principal()
}