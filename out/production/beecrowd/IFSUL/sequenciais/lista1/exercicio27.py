p = float(input())  # Comprimento da pista (metros)
c = float(input())  # Consumo (km/l)
v = int(input())    # Quantidade de voltas
r = int(input())    # Quantidade de reabastecimentos

distancia_total = p * v                        # Distância total percorrida (metros)
consumo_total = distancia_total / c            # Consumo total de combustível (litros)
consumo_por_reabastecimento = (consumo_total / (r + 1)) / 1000  # Consumo de combustível por reabastecimento (litros)

print("{:.1f} litros".format(consumo_por_reabastecimento))
