export const getTime = (val) => {
    const hour = Math.floor(val / 3600);
    const minutes = Math.floor((val - (hour * 3600)) / 60);
    const seconds = val % 60;
    return `${hour}:${minutes}:${seconds}`;
}