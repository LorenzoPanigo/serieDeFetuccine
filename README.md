# Série de Fetuccine

# Desafio de lógica

EXERCÍCIO:

 A série de Fetuccine é gerada da seguinte forma: os dois primeiros termos são fornecidos pelo usuário; a partir daí, os termos são gerados com a soma ou subtração dos dois termos anteriores; ou seja, ela pode-se dar de acordo com as regras seguintes, segundo ou caso que apresente:

- Caso I, para posição impar: quando a posição do temo seja i impar:
    Ai = Ai -1 + Ai - 2


- Caso II para posição par: quando a posição do termo seja i par, obedeça a seguinte condição:
    Ai = Ai -1 - Ai -2
  
Por exemplo dados os dois primeiros termos, que são fornecidos pelo usuário

termo 1 = 1; 
termo 2 = 2;

A serie da Fetuccine vai ser: 1 – 2 – 3 – 1 – 4 – 3 – 7 – 4 – 11 – 7

Escreva um programa em Java onde o usuário fornece os dois primeiros termos da série e o programa gera os 18 termos seguintes.
