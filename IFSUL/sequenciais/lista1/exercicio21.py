salario = 1200.00

taxaluz = (200.00*2.0)/100
taxaagua = (120.00*2.0)/100
luz = 200 + taxaluz
agua = 120 + taxaagua

resto = salario - luz - agua

print("${0:.2f}".format(resto))