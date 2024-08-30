import { getEven } from "../src/1065";

describe("1065", () => {
    it("should return '3 valores pares'", () => {
        const arr = [7, -5, 6, -4, 2];
        const even = getEven(arr);
        expect(even).toEqual(`3 valores pares`);
    })

    it("should return '5 valores pares'", () => {
        const arr = [0, 0, 0, 0, 0];
        const even = getEven(arr);
        expect(even).toEqual(`5 valores pares`);
    })

    it("should return '2 valores pares'", () => {
        const arr = [-2, 1, 18, 9, 3];
        const even = getEven(arr);
        expect(even).toEqual(`2 valores pares`);
    })

    it("should return '3 valores pares'", () => {
        const arr = [0, 1, 4, 2, 19];
        const even = getEven(arr);
        expect(even).toEqual(`3 valores pares`);
    })

    it("should return '3 valores pares'", () => {
        const arr = [0, -1, -4, -2, -19];
        const even = getEven(arr);
        expect(even).toEqual(`3 valores pares`);
    })
})