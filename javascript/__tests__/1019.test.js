import { getTime } from "../src/1019";

describe("1019", () => {
    it("should return '0:9:16'", () => {
        const N = 556;
        const time = getTime(N);
        expect(time).toEqual(`0:9:16`);
    })

    it("should return '0:0:1'", () => {
        const N = 1;
        const time = getTime(N);
        expect(time).toEqual(`0:0:1`);
    })

    it("should return '38:55:53'", () => {
        const N = 140153;
        const time = getTime(N);
        expect(time).toEqual(`38:55:53`);
    })

    it("should return '0:1:25'", () => {
        const N = 85;
        const time = getTime(N);
        expect(time).toEqual(`0:1:25`);
    })

    it("should return '0:1:6'", () => {
        const N = 66;
        const time = getTime(N);
        expect(time).toEqual(`0:1:6`);
    })
})