// 1. Faça um Programa que peça um número e então mostre a mensagem O 
número informado foi [número].


val input = mutableListOf("10.5") //Simulando a entrada do usuário

fun readLine(): String? {
    return if (input.isNotEmpty()) input.removeAt(0) else null
}
fun main() {
    // pede numero ao usuário
    println("Informe um número qualquer: ") //a resposta do usuário chega como String
    
    // Tentar converter a entrada para um número
    val numero: Float? = try {
        readLine()?.toFloat() //Converter a entrada do user para float
    } catch (e: NumberFormatException) {
        println("Entrada inválida. Por favor, digite um número válido!")
        return
    }
    
    if (numero != null){
        println("O número informado foi: $numero")
    } else {
        println("Nenhum número foi informado")
    }
    
}



