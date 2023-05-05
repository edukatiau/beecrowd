salario = int(input())
reajuste = float(input())

reajuste = reajuste/100
salarionovo = salario+(salario*reajuste)

print("R${0:.2f}".format(salarionovo))