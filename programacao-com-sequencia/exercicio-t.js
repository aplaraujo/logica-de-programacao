/*
Elaborar um programa que leia dois valores numéricos reais desconhecidos 
representados pelas variáveis A e B. Calcular, armazenar e apresentar os 
resultados das quatros operações aritméticas básicas.
*/

const getSum = (num1, num2) => num1 + num2
const getSub = (num1, num2) => num1 - num2
const getMult = (num1, num2) => num1 * num2
const getDiv = (num1, num2) => num1 / num2

const A = 10
const B = 5

console.log(getSum(A, B))
console.log(getSub(A, B))
console.log(getMult(A, B))
console.log(getDiv(A, B))