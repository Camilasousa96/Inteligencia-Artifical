def calculadora():
    num1 = float(input("Informe o primeiro número: "))
    num2 = float(input("Informe o segundo número: "))
    operador = input("Informe o operador: ")

    match operador:
        case '+':
            resultado = num1 + num2
            operacao = 'adição'
        case '-':
            resultado = num1 - num2
            operacao = 'subtração'
        case '*':
            resultado = num1 * num2
            operacao = 'multiplicação'
        case '/':
            resultado = num1 / num2
            operacao = 'divisão'

    print(f"O resultado da {operacao} é: {resultado}")
calculadora()
    