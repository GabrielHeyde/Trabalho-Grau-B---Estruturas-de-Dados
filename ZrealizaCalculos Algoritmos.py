import math

def calculate_mean(values):
    return sum(values) / len(values)

def calculate_variance(values, mean):
    return sum((x - mean) ** 2 for x in values) / (len(values) - 1)

def main():
    # Receber os 10 valores
    values = []
    print("Digite 10 valores:")
    for _ in range(10):
        values.append(float(input()))

    # Calcular a média
    mean = calculate_mean(values)

    # Calcular a variância
    variance = calculate_variance(values, mean)

    # Calcular o desvio padrão
    standard_deviation = math.sqrt(variance)

    # Determinar o intervalo
    lower_bound = mean - standard_deviation
    upper_bound = mean + standard_deviation

    # Encontrar os valores dentro do intervalo
    values_within_interval = [x for x in values if lower_bound <= x <= upper_bound]

    # Calcular a média dos valores dentro do intervalocl
    if values_within_interval:
        mean_within_interval = calculate_mean(values_within_interval)
    else:
        mean_within_interval = 0

    # Exibir o resultado
    print(f"Valores dentro do intervalo ({lower_bound:.2f} a {upper_bound:.2f}):")
    print(values_within_interval)
    print(f"Média dos valores dentro do intervalo: {mean_within_interval:.2f}")

if __name__ == "__main__":
    main()