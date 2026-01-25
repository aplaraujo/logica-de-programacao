import { getIntervalValues } from "../src/1072";

describe("1072", () => {
    it("should return '2 in, 2 out'", () => {
        const N = 4;
        const arr = [14, 123, 10, -25];
        const result = getIntervalValues(N, arr);
        expect(result).toEqual(`2 in, 2 out`);
    })

    it("should return '11 in, 0 out'", () => {
        const N = 11;
        const arr = [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20];
        const result = getIntervalValues(N, arr);
        expect(result).toEqual(`11 in, 0 out`);
    })

    it("should return '0 in, 4 out'", () => {
        const N = 4;
        const arr = [0, 1, 2, 3];
        const result = getIntervalValues(N, arr);
        expect(result).toEqual(`0 in, 4 out`);
    })

    it("should return '3 in, 2 out'", () => {
        const N = 5;
        const arr = [11, 2, 10, 20, 100];
        const result = getIntervalValues(N, arr);
        expect(result).toEqual(`3 in, 2 out`);
    })

    it("should return '6 in, 4 out'", () => {
        const N = 10;
        const arr = [1, 20, 10, 3, 5, 12, 14, 99, 17, 19];
        const result = getIntervalValues(N, arr);
        expect(result).toEqual(`6 in, 4 out`);
    })
})