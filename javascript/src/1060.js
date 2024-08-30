export const getPositive = (numArr) => {
    const positive = [];
    for (let i = 0; i <= 6; i++) {
        if (numArr[i] > 0) {
            positive.push(numArr[i])
        }
    }
    return `${positive.length} valores positivos`
}