import java.net.ServerSocket
import java.net.InetAddress

fun main() {
    val servidor = ServerSocket(
        5000,
        1,
        InetAddress.getByName("0.0.0.0")
    )

    println("Servidor escutando na porta 5000")

    val conexao = servidor.accept()
    println("Cliente conectado!")

    val mensagem = "Bem-vindo ao servidor!"
    conexao.getOutputStream().write(
        mensagem.toByteArray(Charsets.UTF_8)
    )

    conexao.close()
    servidor.close()

    println("Servidor encerrado")
}