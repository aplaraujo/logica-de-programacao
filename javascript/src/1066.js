export const getInfo = (numArr) => {
    const even = []
    const odd = []
    const above = []
    const below = []

    for (let i = 0; i <= 4; i++) {

        if (numArr[i] % 2 == 0) {
            even.push(numArr[i])
        } else {
            odd.push(numArr[i])
        }

        if (numArr[i] > 0) {
            above.push(numArr[i])
        } else if (numArr[i] < 0) {
            below.push(numArr[i])
        }
    }

    return `${even.length} valor(es) par(es), ${odd.length} valor(es) impar(es), ${above.length} valor(es) positivo(s), ${below.length} valor(es) negativo(s)`
}