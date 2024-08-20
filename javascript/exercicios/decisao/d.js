const n1 = 8;
const n2 = 9;
const n3 = 10;
const n4 = 10;

const md = (n1 + n2 + n3 + n4) / 4;

if (md >= 7) {
    console.log("Aprovado");
} else {
    const ne = 7;
    const md2 = (ne + md) / 2;
    if (md2 >= 5) {
        console.log("Aprovado em exame");
    } else {
        console.log("Reprovado");
    }
}