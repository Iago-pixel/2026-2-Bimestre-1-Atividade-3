import java.net.Socket
import kotlin.random.Random

fun produzirDados(): List<Int> {
    return List(100) {
        Random.nextInt(0, 111)
    }
}

fun main() {

    val dados = produzirDados()

    println("Processo A produziu:")
    println(dados)

    val socket = Socket("processo-b", 5000)

    println("Processo A: conectado ao Processo B!")

    val mensagem = dados.joinToString(",")

    val writer = socket
        .getOutputStream()
        .bufferedWriter()

    writer.write(mensagem)
    writer.newLine()
    writer.flush()

    println("Processo A: dados enviados!")

    socket.close()
}