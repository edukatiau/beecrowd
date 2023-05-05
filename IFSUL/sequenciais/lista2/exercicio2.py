import math
b = float(input())
h = float(input())

perimetro = 2*b + 2*h
area = b*h
diagonal = math.sqrt(b**2 + h**2)

print("{0:.1f}\n{1:.1f}\n{2:.2f}".format(perimetro, area, diagonal))