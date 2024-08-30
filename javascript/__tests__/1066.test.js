import { getInfo } from "../src/1066";

describe("1066", () => {
    it("should return '3 valor(es) par(es), 2 valor(es) impar(es), 1 valor(es) positivo(s), 3 valor(es) negativo(s)'", () => {
        const arr = [-5, 0, -3, -4, 12];
        const info = getInfo(arr);
        expect(info).toEqual(`3 valor(es) par(es), 2 valor(es) impar(es), 1 valor(es) positivo(s), 3 valor(es) negativo(s)`)
    })

    it("should return '5 valor(es) par(es), 0 valor(es) impar(es), 0 valor(es) positivo(s), 0 valor(es) negativo(s)'", () => {
        const arr = [0, 0, 0, 0, 0];
        const info = getInfo(arr);
        expect(info).toEqual(`5 valor(es) par(es), 0 valor(es) impar(es), 0 valor(es) positivo(s), 0 valor(es) negativo(s)`)
    })

    it("should return '3 valor(es) par(es), 2 valor(es) impar(es), 1 valor(es) positivo(s), 3 valor(es) negativo(s)'", () => {
        const arr = [-1, 0, -4, -6, 19];
        const info = getInfo(arr);
        expect(info).toEqual(`3 valor(es) par(es), 2 valor(es) impar(es), 1 valor(es) positivo(s), 3 valor(es) negativo(s)`)
    })

})