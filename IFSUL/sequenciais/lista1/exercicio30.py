p = int(input())
n = int(input())

gramas = p * 1000
peso12 = ((p * 12) / 100) + p
pesofinal = ((peso12 * n) / 100) + peso12

print("Gramas = {0}g\n"
      "Peso depois dos 12% = {1:.2f}kg\n"
      "Peso final = {2:.2f}kg".format(gramas, peso12, pesofinal))