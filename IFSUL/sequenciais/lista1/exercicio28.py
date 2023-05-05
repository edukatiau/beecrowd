# Leitura dos valores de entrada
E = int(input())
V = int(input())
S = float(input())
B = float(input())

# Cálculo do salário base de cada empregado
salario_base = 2 * S

# Cálculo da comissão de cada bicicleta vendida
comissao = ((((V * B) * 15) / 100) / E)

# Cálculo do salário final de cada empregado
salario_final = salario_base + comissao

# Cálculo do lucro da loja
lucro = ((B * V) / 2) - (salario_final * E)

# Impressão dos resultados
print("Salario = R${0:.2f}\n"
      "Lucro = R${1:.2f}".format(salario_final, lucro))