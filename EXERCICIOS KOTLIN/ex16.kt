/* 16. Faça um programa que peça o tamanho de um arquivo para download (em 
MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o 
tempo aproximado de download do arquivo usando este link (em minutos).*/

fun main(){
    //solicitar tamanho
    println("Informe o tamanho do arquivo para douwnload em MB: ")
    val tamanho_arquivo = readLine()!!.toFloat()
    
    //solicitar velocidade
    println("Informe a velocidade do link de internet (em mbps) ")
    val velocidade_internet = readLine()!!.toFloat()
    
    //converter Mbps para MBps
    val velocidade_mbps = velocidade_internet/8
    
    //calcular tempo de download
    val tempo_segundos = tamanho_arquivo / velocidade_mbps
    
    //converte o tempo para minutos
    val tempo_minutos = tempo_segundos / 60
    
    println("O tempo aproximado de download do arquivo é: %.2f minutos".format(tempo_minutos))
    
}