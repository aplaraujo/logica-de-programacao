export const getFuelQuantity = (veloc, time) => {
    const dist = veloc * time;
    const fuel = dist / 12;
    return fuel.toFixed(3);
}