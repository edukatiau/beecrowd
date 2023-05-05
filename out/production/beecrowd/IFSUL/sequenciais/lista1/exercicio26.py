precogasolina = 2.50

i = float(input())
f = float(input())
l = float(input())
v = float(input())

distancia = f - i #trajeto
mediaconsumo = distancia / l #media
gastogasolina = precogasolina * l #dinheiro da gasolina
lucro = v - gastogasolina #lucro

print("Media de consumo: {0:.2f} Km/l\n"
      "Lucro: ${1:.2f}".format(mediaconsumo, lucro))