import { getTime } from "../src/1016";

describe("1016", () => {
    it("should return '60 minutos'", () => {
        const dist = 30;
        const time = getTime(dist);
        expect(time).toEqual(`60 minutos`);
    })

    it("should return '220 minutos'", () => {
        const dist = 110;
        const time = getTime(dist);
        expect(time).toEqual(`220 minutos`);
    })

    it("should return '14 minutos'", () => {
        const dist = 7;
        const time = getTime(dist);
        expect(time).toEqual(`14 minutos`);
    })

    it("should return '180 minutos'", () => {
        const dist = 90;
        const time = getTime(dist);
        expect(time).toEqual(`180 minutos`);
    })
})