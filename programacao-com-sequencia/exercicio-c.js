/*
Calcular e apresentar o valor do volume de uma lata de óleo, utilizando
a fórmula VOLUME <- 3.14159 * (R ** 2) * ALTURA
*/

const getVolume = (height, radius) => {
  return 3.14159 * Math.pow(radius, 2) * height;
};

console.log(getVolume(10, 2.5).toFixed(2));
