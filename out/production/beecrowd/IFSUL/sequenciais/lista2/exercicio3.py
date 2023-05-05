X = int(input())
Y = float(input())

caso1 = ((X / 3) * Y) * 12 #anual
caso2 = (((X/3)/10)*(Y/10))*12
caso3 = int(((X - (X * 2/100))/10) + X - (X*2)/100) #quantidade q a locadora tera no final do ano
faturamento = caso1 + caso2
print("{0:.2f}\n{1:.2f}\n{2}".format(faturamento, caso2, caso3))