numero = int(input())

passo1 = numero + int(str(numero)[::-1])
passo2 = (int(str(passo1)[0]) * 1) + (int(str(passo1)[1]) * 2) + (int(str(passo1)[2]) * 3)
verificador = int(str(passo2)[-1:])

print(verificador)