/*
Elaborar um programa que efetue a leitura de três valores inteiros 
(representados pelas variáveis A, B e C) e apresente como resultado final 
o valor do quadrado da soma dos três valores lidos.
*/

const getSumSquared = (num1, num2, num3) => {
    const sum = num1 + num2 + num3
    return Math.pow(sum, 2)
}

console.log(getSumSquared(1, 2, 3))
console.log(getSumSquared(4, 5, 6))
console.log(getSumSquared(7, 8, 9))