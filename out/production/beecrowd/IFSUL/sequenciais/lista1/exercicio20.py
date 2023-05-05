idade_dias = int(input())

# cálculo da idade em anos, meses e dias
anos = idade_dias // 365
meses = (idade_dias % 365) // 30
dias = (idade_dias % 365) % 30

# impressão dos resultados
print("{0} ano(s), {1} mes(es) e {2} dia(s)".format(anos, meses, dias))