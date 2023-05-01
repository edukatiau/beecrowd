x = float(input()) #valor diaria

a = (x * 78) / 100
b = (x * 42) * 12
c = (((x * 78) / 100) * 42) * 21
d = c - b

print("R$ {0:.2f}\n"
      "R$ {1:.2f}\n"
      "R$ {2:.2f}\n"
      "R$ {3:.2f}".format(a, b, c, d))