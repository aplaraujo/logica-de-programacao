/*
Efetuar o cálculo e a apresentação do valor de uma prestação em atraso utilizando a fórmula 
PRESTAÇÃO <- VALOR + (VALOR * (TAXA / 100) * TEMPO).
*/

const value = 100
const tax = 15
const time = 5

const parcel = value + (value * (tax / 100) * time)

console.log(`Valor da prestação em atraso: R$ ${parcel.toFixed(2)}`)