export const getDiff = (A, B, C, D) => {
    const diff = (A * B) - (C * D);
    return `DIFERENCA = ${diff}`;
}