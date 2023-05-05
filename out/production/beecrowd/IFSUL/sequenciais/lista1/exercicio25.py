e = int(input())
b = int(input())
n = int(input())
v = int(input())

brancos = (100 * b) / e
nulos = (100 * n) / e
validos = (100 * v) / e

print("{0:.1f} (percentual de votos brancos)\n"
      "{1:.1f} (percentual de votos nulos)\n"
      "{2:.1f} (percentual de votos validos)".format(brancos, nulos, validos))