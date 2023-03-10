/*
Ler dois valores numéricos inteiros (representados pelas variáveis A e B) 
e apresentar o resultado inteiro do quadrado da divisão de A por B armazenado em memória.
*/

const getDivisionSquared = (num1, num2) => {
    const div = num1 / num2
    return Math.pow(div, 2)
}

console.log(getDivisionSquared(10, 2))
console.log(getDivisionSquared(20, 5))
console.log(getDivisionSquared(3, 3))
console.log(getDivisionSquared(16, 4))