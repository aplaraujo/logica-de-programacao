/*
Efetuar o cálculo da quantidade de litros de combustível gastos em uma 
viagem utilizando um automóvel que faz 12 Km por litro. 
Para obter o cálculo, o usuário deverá fornecer o tempo gasto e a 
velocidade média durante a viagem. Desta forma, será possível obter a distância 
percorrida com a fórmula DISTÂNCIA <- TEMPO * VELOCIDADE. Tendo o valor da distância, 
basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula:
LITROS_USADOS <- DISTÂNCIA / 12. O programa deverá apresentar os valores da velocidade 
média, tempo gasto na viagem, a distância percorrida e a quantidade de litros usada na viagem.
*/


const time = 3
const speed = 80

const distance = time * speed

const litersGasoline = distance / 12

console.log(time, speed, distance, litersGasoline)