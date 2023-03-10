/*
Construir um programa que calcule, armazene e apresente, em metros por segundo, 
o valor da velocidade de um projétil que percorre uma distância em quilômetros 
a um espaço de tempo em minutos. Utilize a fórmula:
VELOCIDADE <- (DISTANCIA * 1000) / (TEMPO * 60)
*/

const getSpeed = (distance, time) => (distance * 1000) / (time * 60)

console.log(getSpeed(100, 30).toFixed(1))