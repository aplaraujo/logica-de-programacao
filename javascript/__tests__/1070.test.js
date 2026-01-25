import { getOddValues } from "../src/1070";

describe("1070", () => {
    it('should return [9, 11, 13, 15, 17, 19]', () => {
        const first = 8;
        const result = getOddValues(first);
        expect(result).toEqual([9, 11, 13, 15, 17, 19])
    })

    it('should return [23, 25, 27, 29, 31, 33]', () => {
        const first = 23;
        const result = getOddValues(first);
        expect(result).toEqual([23, 25, 27, 29, 31, 33])
    })

    it('should return [39, 41, 43, 45, 47, 49]', () => {
        const first = 39;
        const result = getOddValues(first);
        expect(result).toEqual([39, 41, 43, 45, 47, 49])
    })

    it('should return [15, 17, 19, 21, 23, 25]', () => {
        const first = 14;
        const result = getOddValues(first);
        expect(result).toEqual([15, 17, 19, 21, 23, 25])
    })

    it('should return [41, 43, 45, 47, 49, 51]', () => {
        const first = 40;
        const result = getOddValues(first);
        expect(result).toEqual([41, 43, 45, 47, 49, 51])
    })
})