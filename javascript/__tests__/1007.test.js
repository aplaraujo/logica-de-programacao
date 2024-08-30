import { getDiff } from "../src/1007";

describe("1007", () => {
    it("should return 'DIFERENCA = -26'", () => {
        const num1 = 5;
        const num2 = 6;
        const num3 = 7;
        const num4 = 8;
        const diff = getDiff(num1, num2, num3, num4);
        expect(diff).toEqual(`DIFERENCA = -26`);
    })

    it("should return 'DIFERENCA = -56'", () => {
        const num1 = 0;
        const num2 = 0;
        const num3 = 7;
        const num4 = 8;
        const diff = getDiff(num1, num2, num3, num4);
        expect(diff).toEqual(`DIFERENCA = -56`);
    })

    it("should return 'DIFERENCA = 86'", () => {
        const num1 = 5;
        const num2 = 6;
        const num3 = -7;
        const num4 = 8;
        const diff = getDiff(num1, num2, num3, num4);
        expect(diff).toEqual(`DIFERENCA = 86`);
    })

    it("should return 'DIFERENCA = 5'", () => {
        const num1 = 7;
        const num2 = 3;
        const num3 = 2;
        const num4 = 8;
        const diff = getDiff(num1, num2, num3, num4);
        expect(diff).toEqual(`DIFERENCA = 5`);
    })

    it("should return 'DIFERENCA = 0'", () => {
        const num1 = 2;
        const num2 = 2;
        const num3 = 2;
        const num4 = 2;
        const diff = getDiff(num1, num2, num3, num4);
        expect(diff).toEqual(`DIFERENCA = 0`);
    })
})