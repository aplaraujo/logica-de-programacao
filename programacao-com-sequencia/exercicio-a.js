/*
Ler uma temperatura em graus Celsius e apresentá-la convertida em graus
Fahrenheit. A fórmula de conversão é F <- C * (9 / 5) + 32, sendo F a
temperatura em Fahrenheit e C a temperatura em Celsius.
*/

const getFahrenheitTemperature = tempC => {
	return tempC * (9 / 5) + 32
}

console.log(`Temperatura em Fahrenheit: ${getFahrenheitTemperature(35.5).toFixed(1)}ºF`)