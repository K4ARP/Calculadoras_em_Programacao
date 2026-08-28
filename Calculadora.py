def pedir_operacao():
    operadores = ['+', '-', '*', '/']
    while True:
        op = str(input('Digite a operação que deseja realizar:'))
        if op in operadores:
            return op
        else:
            print('Valor inválido!')    
def pedir_numero():
    while True:
        try:
            num = int(input('Digite um número:'))
        except ValueError:
            print('Valor inválido!')
        else:
            return num
def calculo(resultado, operacao, numero):
    if operacao == '+':
        return resultado + numero
    elif operacao == '-':
        return resultado - numero
    elif operacao == '*':
        return resultado * numero
    elif operacao == '/':
        return resultado / numero
def fim():
    while True:
        try:
            resposta = str(input('Deseja finalizar a conta? [S s / N n]')).lower()
        except ValueError:
            print('Valor inválido!')
        else:
            if 's' in resposta:
                return resposta
            else:
                print('Resposta inválida! Tente novamente com [S s / N n]')
def mostrar():
    print('=====================================')
mostrar()
resultado = pedir_numero()
while True:
    mostrar()
    op = pedir_operacao()
    mostrar()
    numero = pedir_numero()
    mostrar()
    resultado = calculo(resultado, op, numero)
    resposta = fim().lower()
    if 's' in resposta:
        break
mostrar()
print(f'O resultado da conta é {resultado}')
mostrar()

