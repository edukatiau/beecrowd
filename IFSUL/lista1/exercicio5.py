X = float(input()) #preço de fabrica do caminhao

impostoCustoFabrica = ((X * 45) / 100) + X
porcDistribuidor = ((impostoCustoFabrica * 28) / 100)

valorfinal = impostoCustoFabrica + porcDistribuidor
print(valorfinal)