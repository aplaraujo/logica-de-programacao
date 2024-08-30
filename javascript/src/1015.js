export const getDistance = (X1, Y1, X2, Y2) => {
    const distance = Math.sqrt(Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2));
    return distance.toFixed(4);
}