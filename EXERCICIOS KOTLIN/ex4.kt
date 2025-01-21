// 4. Faça um Programa que converta metros para centímetros.

fun main(){
    val m: Float
    val cm: Float
    
    print("Informe a medida em metros: ")
    m = readLine()!!.toFloat()
    
    cm = 100*m
    
    println("A medida em centímetros é: $cm cm")
}