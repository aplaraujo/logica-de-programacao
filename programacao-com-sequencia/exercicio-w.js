/*
Elaborar um programa que leia dois valores numéricos inteiros, os quais devem representar a 
base e o expoente de uma potência. Calcular a potência, armazenar em memória o resultado 
calculado e apresentar o resultado obtido.
*/

const getPower = (num1, num2) => Math.pow(num1, num2)

console.log(getPower(2, 10))
console.log(getPower(1, 5))
console.log(getPower(5, 2))
console.log(getPower(10, 3))
console.log(getPower(1, 1))
console.log(getPower(-1, 2))
console.log(getPower(0, 0))