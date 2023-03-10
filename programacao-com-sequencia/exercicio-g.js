/*
Ler quatro valores numéricos inteiros e apresentar o resultado das adições 
e das multiplicações usando o conceito de propriedade distributiva para a 
máxima combinação possível entre as quatro variáveis. Considerando o uso das 
variáveis A, B, C e D, deverão ser efetuadas seis adições e seis multiplicações, 
ou seja, de forma geral deverá ser combinada a variável A com a variável B, 
a variável A com a variável C e a variável A com a variável D. Depois será necessário 
combinar a variável B com a variável C e a variável B com a variável D. 
Por fim, a variável C será combinada com a variável D.
*/

const A = 15
const B = 5
const C = 4
const D = 2

const s1 = A + B
const s2 = A + C
const s3 = A + D
const s4 = B + C
const s5 = B + D
const s6 = C + D

const m1 = A * B
const m2 = A * C
const m3 = A * D
const m4 = B * C
const m5 = B * D
const m6 = C * D

console.log(s1, s2, s3, s4, s5, s6)
console.log(m1, m2, m3, m4, m5, m6)