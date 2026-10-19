import java.net.Socket

fun main() {
    val cliente = Socket("servidor", 5000)

    println("Conectado ao servidor!")

    val buffer = ByteArray(1024)
    val quantidade = cliente.getInputStream().read(buffer)

    if (quantidade != -1) {
        val mensagem = String(
            buffer, 0, quantidade, Charsets.UTF_8
        )
        println("Mensagem recebida: $mensagem")
    }

    cliente.close()
    println("Conexão encerrada")
}