/*
Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) 
de um valor lido em dólar (US$). O programa deverá solicitar o valor da cotação do dólar 
e também a quantidade de dólares disponível com o usuário.
*/

const dollarToBrazilianReal = (dollar, exchangeRate) => {
    return dollar * exchangeRate
}

console.log(dollarToBrazilianReal(500, 5.30))
console.log(dollarToBrazilianReal(100, 5.30))
console.log(dollarToBrazilianReal(1000, 5.30))
console.log(dollarToBrazilianReal(50, 5.30))