export const getIntervalValues = (val, numArr) => {
    const yes = [];
    const no = [];
    for (let i = 0; i < val; i++) {
        if (numArr[i] >= 10 && numArr[i] <= 20) {
            yes.push(numArr[i]);
        } else {
            no.push(numArr[i]);
        }
    }
    return `${yes.length} in, ${no.length} out`;
}