/*
Ler dois valores numéricos inteiros (variáveis A e B) e apresentar 
o resultado do quadrado da diferença do primeiro valor (variável A) 
pelo segundo valor (variável B)
*/

const squaredDifference = (num1, num2) => {
    const diff = num1 - num2
    return Math.pow(diff, 2)
}

console.log(squaredDifference(10, 5))
console.log(squaredDifference(2, 1))
console.log(squaredDifference(100, 50))