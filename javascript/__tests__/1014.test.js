import { getFuelUse } from "../src/1014";

describe("1014", () => {
    it("should return '14.286 km/l'", () => {
        const dist = 500;
        const comb = 35.0;
        const cons = getFuelUse(dist, comb);
        expect(cons).toEqual(`14.286 km/l`)
    })

    it("should return '18.119 km/l'", () => {
        const dist = 2254;
        const comb = 124.4;
        const cons = getFuelUse(dist, comb);
        expect(cons).toEqual(`18.119 km/l`)
    })

    it("should return '9.802 km/l'", () => {
        const dist = 4554;
        const comb = 464.6;
        const cons = getFuelUse(dist, comb);
        expect(cons).toEqual(`9.802 km/l`)
    })

    it("should return '3.143 km/l'", () => {
        const dist = 22;
        const comb = 7.0;
        const cons = getFuelUse(dist, comb);
        expect(cons).toEqual(`3.143 km/l`)
    })

    it("should return '23.810 km/l'", () => {
        const dist = 50;
        const comb = 2.1;
        const cons = getFuelUse(dist, comb);
        expect(cons).toEqual(`23.810 km/l`)
    })
})