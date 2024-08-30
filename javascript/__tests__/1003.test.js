import getSum from '../src/1003.js';

describe("1003", () => {
    it("should return 'SOMA = 40'", () => {
        const num1 = 30;
        const num2 = 10;
        const sum = getSum(num1, num2);
        expect(sum).toEqual(`SOMA = 40`);
    })

    it("should return 'SOMA = -20'", () => {
        const num1 = -30;
        const num2 = 10;
        const sum = getSum(num1, num2);
        expect(sum).toEqual(`SOMA = -20`);
    })

    it("should return 'SOMA = 0'", () => {
        const num1 = 0;
        const num2 = 0;
        const sum = getSum(num1, num2);
        expect(sum).toEqual(`SOMA = 0`);
    })

    it("should return 'SOMA = 200'", () => {
        const num1 = 100;
        const num2 = 100;
        const sum = getSum(num1, num2);
        expect(sum).toEqual(`SOMA = 200`);
    })

    it("should return 'SOMA = 16'", () => {
        const num1 = 20;
        const num2 = -4;
        const sum = getSum(num1, num2);
        expect(sum).toEqual(`SOMA = 16`);
    })

    it("should return 'SOMA = -72'", () => {
        const num1 = -89;
        const num2 = 17;
        const sum = getSum(num1, num2);
        expect(sum).toEqual(`SOMA = -72`);
    })

    it("should return 'SOMA = 4'", () => {
        const num1 = -3;
        const num2 = 7;
        const sum = getSum(num1, num2);
        expect(sum).toEqual(`SOMA = 4`);
    })

    it("should return 'SOMA = 49'", () => {
        const num1 = 40;
        const num2 = 9;
        const sum = getSum(num1, num2);
        expect(sum).toEqual(`SOMA = 49`);
    })

    it("should return 'SOMA = -457'", () => {
        const num1 = -456;
        const num2 = -1;
        const sum = getSum(num1, num2);
        expect(sum).toEqual(`SOMA = -457`);
    })

    it("should return 'SOMA = 63'", () => {
        const num1 = 60;
        const num2 = 3;
        const sum = getSum(num1, num2);
        expect(sum).toEqual(`SOMA = 63`);
    })

    it("should return 'SOMA = 123'", () => {
        const num1 = 100;
        const num2 = 23;
        const sum = getSum(num1, num2);
        expect(sum).toEqual(`SOMA = 123`);
    })
})