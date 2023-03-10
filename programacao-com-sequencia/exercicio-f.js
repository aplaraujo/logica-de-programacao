/*
Ler dois valores para as variáveis A e B e efetuar a troca 
dos valores de forma que a variável A passe a possuir o valor 
da variável B e a variável B passe a possuir o valor da variável A. 
Apresentar os valores trocados.
*/

let A = 5
let B = 10
let aux

console.log(`Valor de A: ${A}`)
console.log(`Valor de B: ${B}`)

aux = A
A = B
B = aux

console.log(`Valor de A: ${A}`)
console.log(`Valor de B: ${B}`)