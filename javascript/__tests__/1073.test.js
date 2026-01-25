import { getSquareValues } from "../src/1073";

describe("1073", () => {
    it("should return [ 4, 16, 36 ]", () => {
        const N = 6;
        const result = getSquareValues(N);
        expect(result).toEqual([ 4, 16, 36 ])
    })

    it("should return [ 4, 16, 36, 64 ]", () => {
        const N = 9;
        const result = getSquareValues(N);
        expect(result).toEqual([ 4, 16, 36, 64 ])
    })

    it("should return [ 4, 16, 36, 64, 100 ]", () => {
        const N = 10;
        const result = getSquareValues(N);
        expect(result).toEqual([ 4, 16, 36, 64, 100 ])
    })

    it("should return [4,  16,  36,  64, 100, 144, 196, 256, 324]", () => {
        const N = 19;
        const result = getSquareValues(N);
        expect(result).toEqual([4,  16,  36,  64, 100, 144, 196, 256, 324])
    })
})