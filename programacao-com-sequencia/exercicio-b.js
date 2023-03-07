/*
Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus
Celsius. A fórmula de conversão é C <- ((F - 32) * 5) / 9, sendo F a
temperatura em Fahrenheit e C a temperatura em Celsius.
*/

const getCelsiusTemperature = (tempF) => {
	return ((tempF - 32) * 5) / 9
}

console.log(`Temperatura em Celsius: ${getCelsiusTemperature(95.9).toFixed(1)}ºC`)