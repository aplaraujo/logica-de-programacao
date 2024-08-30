import getMult from "../src/1004";

describe("1004", () => {
    it("should return 'PROD = 27'", () => {
        const num1 = 3;
        const num2 = 9;
        const mult = getMult(num1, num2);
        expect(mult).toEqual(`PROD = 27`)
    })

    it("should return 'PROD = -300'", () => {
        const num1 = -30;
        const num2 = 10;
        const mult = getMult(num1, num2);
        expect(mult).toEqual(`PROD = -300`)
    })

    it("should return 'PROD = 0'", () => {
        const num1 = 0;
        const num2 = 9;
        const mult = getMult(num1, num2);
        expect(mult).toEqual(`PROD = 0`)
    })

    it("should return 'PROD = 0'", () => {
        const num1 = 0;
        const num2 = 0;
        const mult = getMult(num1, num2);
        expect(mult).toEqual(`PROD = 0`)
    })

    it("should return 'PROD = 3645'", () => {
        const num1 = 45;
        const num2 = 81;
        const mult = getMult(num1, num2);
        expect(mult).toEqual(`PROD = 3645`)
    })

    it("should return 'PROD = -229977'", () => {
        const num1 = 23;
        const num2 = -9999;
        const mult = getMult(num1, num2);
        expect(mult).toEqual(`PROD = -229977`)
    })

    it("should return 'PROD = 34568000'", () => {
        const num1 = 8000;
        const num2 = 4321;
        const mult = getMult(num1, num2);
        expect(mult).toEqual(`PROD = 34568000`)
    })

    it("should return 'PROD = 807200'", () => {
        const num1 = 400;
        const num2 = 2018;
        const mult = getMult(num1, num2);
        expect(mult).toEqual(`PROD = 807200`)
    })

    it("should return 'PROD = 5332114'", () => {
        const num1 = 1234;
        const num2 = 4321;
        const mult = getMult(num1, num2);
        expect(mult).toEqual(`PROD = 5332114`)
    })

    it("should return 'PROD = 165'", () => {
        const num1 = 33;
        const num2 = 5;
        const mult = getMult(num1, num2);
        expect(mult).toEqual(`PROD = 165`)
    })
})