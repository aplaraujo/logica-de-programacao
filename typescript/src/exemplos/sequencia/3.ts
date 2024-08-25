const HT = 65;
const VH = 100;
const PD = 5;
const SB = HT * VH;
const TD = SB * (PD / 100);
const SL = SB - TD;

console.log(SL.toFixed(2));