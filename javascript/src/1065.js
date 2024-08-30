export const getEven = (numArr) => {
    const even = [];
    for (let i = 0; i <= 4 ; i++) {
        if (numArr[i] % 2 === 0) {
            even.push(numArr[i]);
        }
    }
    return `${even.length} valores pares`;
}