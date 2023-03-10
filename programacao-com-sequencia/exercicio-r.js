/*
Elaborar um programa de computador que calcule e apresente o valor da área 
de uma circunferência (variável A). Para tanto, o programa deve solicitar o valor 
do raio (variável R) e fazer uso da fórmula de cálculo: A <- 3.14159 * R ** 2.
*/

const getArea = (radius) => {
    return 3.14159 * Math.pow(radius, 2)
}

console.log(getArea(50).toFixed(2))
console.log(getArea(12).toFixed(2))
console.log(getArea(5).toFixed(2))