/*
Construir um programa que leia um valor numérico inteiro e apresente como 
resultado armazenado em memória os seus valores antecessor e sucessor.
*/

const getPrevious = (num) => num - 1
const getNext = (num) => num + 1

console.log(getPrevious(1), 1, getNext(1))
console.log(getPrevious(2), 2, getNext(2))
console.log(getPrevious(3), 3, getNext(3))
console.log(getPrevious(4), 4, getNext(4))