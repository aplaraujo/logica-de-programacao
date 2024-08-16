const A = 24;
const B = 20;
const C = 99;
const N = 30;
const VB = 86;

const T = A + B + C + N + VB;
const PV = ((A + B + C) / T) * 100;
const PA = (A / T) * 100;
const PB = (B / T) * 100;
const PC = (C / T) * 100;
const PN = (N / T) * 100;
const PVB = (VB / T) * 100;

console.log(T, PV.toFixed(1), PA.toFixed(1), PB.toFixed(1), PC.toFixed(1), PN.toFixed(1), PVB.toFixed(1));