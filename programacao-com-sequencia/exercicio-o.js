/*
Elaborar um programa de computador que efetue a leitura de quatro valores inteiros 
(variáveis A, B, C e D). Ao final o programa deve apresentar o resultado do produto 
(variável P) do primeiro com o terceiro valor e o resultado da soma (variável S) 
do segundo com o quarto valor.
*/

const getProductAndSum = (num1, num2, num3, num4) => {
    const prod = num1 * num3
    const sum = num2 + num4
    return [prod, sum]
}

console.log(getProductAndSum(1, 2, 3, 4))
console.log(getProductAndSum(5, 6, 7, 8))
console.log(getProductAndSum(9, 10, 11, 12))