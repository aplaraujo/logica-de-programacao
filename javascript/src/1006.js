const getAverage = (A, B, C) => {
    const average = ((A * 2) + (B * 3) + (C * 5)) / 10;
    return `MEDIA = ${average.toFixed(1)}`;
}

export default getAverage;