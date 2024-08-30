export const getFuelUse = (X, Y) => {
    const fuel = (X / Y);
    return `${fuel.toFixed(3)} km/l`;
}