/* 6. Faça um Programa que calcule a área de um quadrado, em seguida mostre 
 o dobro desta área para o usuário.*/
 
 fun main(){
    val lado: Float
    val area: Float
    val dobro: Float
    
    println("Informe a medida do lado do quadrado: ")
    lado = readLine()!!.toFloat()
    
    //calculo
    area = lado * lado
    dobro = area * 2
    
    println("O dobro da área é: $dobro")
}