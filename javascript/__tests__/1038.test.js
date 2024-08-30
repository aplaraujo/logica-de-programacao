import { getTotal } from "../src/1038";

describe("1038", () => {
    it("should return 'Total: R$ 10.00'", () => {
        const cod = 3;
        const qtd = 2;
        const total = getTotal(cod, qtd);
        expect(total).toEqual(`Total: R$ 10.00`)
    })

    it("should return 'Total: R$ 6.00'", () => {
        const cod = 4;
        const qtd = 3;
        const total = getTotal(cod, qtd);
        expect(total).toEqual(`Total: R$ 6.00`)
    })

    it("should return 'Total: R$ 13.50'", () => {
        const cod = 2;
        const qtd = 3;
        const total = getTotal(cod, qtd);
        expect(total).toEqual(`Total: R$ 13.50`)
    })

    it("should return 'Total: R$ 8.00'", () => {
        const cod = 1;
        const qtd = 2;
        const total = getTotal(cod, qtd);
        expect(total).toEqual(`Total: R$ 8.00`)
    })
})