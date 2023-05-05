x = float(input())
y = float(input())
z = int(input())

valordoaluguel = x + (x*(y/100)*z)

print("Valor do aluguel: ${0:.2f}".format(valordoaluguel))