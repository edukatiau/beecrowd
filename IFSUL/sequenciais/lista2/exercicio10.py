p = float(input())
b = float(input())

lucro = p * 0.12 + b * 1.5
poupanca = (lucro * 10.0) / 100

print("{0:.2f}\n{1:.2f}".format(lucro, poupanca))