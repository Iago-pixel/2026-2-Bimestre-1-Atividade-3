import java.net.ServerSocket

fun main() {
    val server = ServerSocket(5000)

    println("Processo B: aguardando conexão do Processo A...")

    val socket = server.accept()

    println("Processo B: Processo A conectado!")

    val mensagem = socket
        .getInputStream()
        .bufferedReader()
        .readLine()

    val dados = mensagem
        .split(",")
        .map { it.toInt() }

    println("Processo B recebeu:")
    println(dados)

    val soma = dados.sum()

    println("Soma dos dados: $soma")

    socket.close()
    server.close()
}