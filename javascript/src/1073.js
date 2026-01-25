export const getSquareValues = (val) => {
    const even = [];
    for(let i = 1; i <= val; i++) {
        if (i % 2 === 0) {
            even.push(i ** 2);
        }
    }
    return even;
}