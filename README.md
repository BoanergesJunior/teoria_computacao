# Teoria da Computacao UFLA

## Máquina de Turing Universal

### Como rodar o projeto

```bash
$git clone https://github.com/BoanergesJunior/teoria_computacao.git
```

### Para Compilar

```bash
$java -jar programa.jar argumento1
```

### Tecnologias

```
Java 11.0.12 2021-07-20 LTS
```

### Informações sobre o trabalho

```
Este trabalho consiste em uma implementação de uma Máquina de Turing Universal que implemente heurísticas para o Problema da Parada.
```

### Informações sobre a Máquina de Turing

```
O modelo da máquina implementada é uma quintupla definida por:
    M = (Q, Σ, Γ, δ, q0)
Aonde:
    Q = conjunto de estados (padrão q[0 − 9] + )
    Σ = alfabeto de entrada ( {1} para representação unária dos argumentos numéricos)
    Γ = alfabeto da fita( {1, B} o símbolo branco fará a separação entre os argumentos
    numéricos na fita
    δ = função de transição no formato (qi ,x ) -> (qj, y, D).  assim, estando no estado qi,
    lendo x, vai para o estado qj, escreve y e movimenta na direção D,
    onde D pode ser L (para esquerda) ou R ( para direita).
    q = estado inicial
```
