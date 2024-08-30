import { getPositive } from "../src/1060";

describe("1060", () => {
    it("should return '4 valores positivos'", () => {
        const arr = [7, -5, 6, -3.4, 4.6, 12];
        const positive = getPositive(arr);
        expect(positive).toEqual(`4 valores positivos`);
    })

    it("should return '4 valores positivos'", () => {
        const arr = [98, -52, 69, -34.4, 6.6, 22];
        const positive = getPositive(arr);
        expect(positive).toEqual(`4 valores positivos`);
    })

    it("should return '1 valores positivos'", () => {
        const arr = [5, -45, -20, -1, -10, -3];
        const positive = getPositive(arr);
        expect(positive).toEqual(`1 valores positivos`);
    })

    it("should return '1 valores positivos'", () => {
        const arr = [-1, -50, -77, -99, 0, 1];
        const positive = getPositive(arr);
        expect(positive).toEqual(`1 valores positivos`);
    })
})