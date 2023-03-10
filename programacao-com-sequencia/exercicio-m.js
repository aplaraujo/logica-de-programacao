/*
Elaborar um programa que efetue a leitura de três valores inteiros 
(representados pelas variáveis A, B e C) e apresente como resultado final o 
valor da soma dos quadrados dos três valores lidos.
*/

const getSumSquared = (num1, num2, num3) => {
    return Math.pow(num1, 2) + Math.pow(num2, 2) + Math.pow(num3, 2)
}

console.log(getSumSquared(1, 2, 3))
console.log(getSumSquared(4, 5, 6))
console.log(getSumSquared(7, 8, 9))