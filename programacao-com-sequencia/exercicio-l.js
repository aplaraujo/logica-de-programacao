/*
Elaborar um programa que efetue a apresentação do valor da conversão em dólar (US$) 
de um valor lido em real (R$). O programa deverá solicitar o valor da cotação do dólar 
e também a quantidade de reais disponível com o usuário.
*/

const brazilianRealToDollar = (real, exchangeRate) => {
    return real / exchangeRate
}

console.log(brazilianRealToDollar(500, 5.30).toFixed(2))
console.log(brazilianRealToDollar(1000, 5.30).toFixed(2))
console.log(brazilianRealToDollar(50, 5.30).toFixed(2))
console.log(brazilianRealToDollar(200, 5.30).toFixed(2))