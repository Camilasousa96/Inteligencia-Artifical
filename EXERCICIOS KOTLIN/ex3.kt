// 3. Faça um Programa que peça as 4 notas bimestrais e mostre a média.

fun main(){
    //criar variáveis
    val nota1: Float
    val nota2: Float
    val nota3: Float
    val nota4: Float
    val media: Float
    
    //Mostrar info para usuários
    println("Informe a nota do primeiro bimestre: ")
    nota1 = readLine()!!.toFloat()
    
    println("Informe a nota do segundo bimestre: ")
    nota2 = readLine()!!.toFloat()
    
    println("Informe a nota do terceiro bimestre: ")
    nota3 = readLine()!!.toFloat()
    
    println("Informe a nota do quarto bimestre: ")
    nota4 = readLine()!!.toFloat()
    
    //Calcular média
    media = (nota1 + nota2 + nota3 + nota4)/4
    println("Sua nota final é: $media")
    
}