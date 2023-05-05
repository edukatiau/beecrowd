x = int(input())
y = int(input())

caso1 = (y * 75) / 100
caso2 = caso1 * x
caso3 = caso1 * ((x * 70)/100)
caso4 = (x*y) - caso2

print("R$ {0:.2f}\n"
      "R$ {1:.2f}\n"
      "R$ {2:.2f}\n"
      "R$ {3:.2f}".format(caso1, caso2, caso3, caso4))