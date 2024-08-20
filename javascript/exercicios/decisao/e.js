const a = 2;
const b = -16;
const c = -18;

const delta = (b ** 2) - (4 * a * c);

if (delta < 0) {
    console.log("Sem raízes");
} else {
    if (delta === 0) {
        console.log("Raízes iguais");
    } else {
        const x1 = - (b + Math.sqrt(delta)) / (2 * a);
        const x2 = - (b - Math.sqrt(delta)) / (2 * a);
        console.log(x1, x2);
    }
}