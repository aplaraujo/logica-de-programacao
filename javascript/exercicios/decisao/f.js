let a = 7;
let b = 21;
let c = -14;
let aux;

if (a > b) {
   aux = a;
   a = b;
   b = aux; 
}

if (a > c) {
    aux = a;
    a = c;
    c = aux;
}

if (b > c) {
    aux = b;
    b = c;
    c = aux;
}

console.log(a, b, c);