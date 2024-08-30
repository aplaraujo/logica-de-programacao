import { getDistance } from "../src/1015";

describe("1015", () => {
    it("should return 4.4721", () => {
        const x1 = 1.0;
        const y1 = 7.0;
        const x2 = 5.0;
        const y2 = 9.0;
        const dist = getDistance(x1, y1, x2, y2);
        expect(dist).toEqual(`4.4721`);
    })

    it("should return 16.1484", () => {
        const x1 = -2.5;
        const y1 = 0.4;
        const x2 = 12.1;
        const y2 = 7.3;
        const dist = getDistance(x1, y1, x2, y2);
        expect(dist).toEqual(`16.1484`);
    })

    it("should return 16.4575", () => {
        const x1 = 2.5;
        const y1 = -0.4;
        const x2 = -12.2;
        const y2 = 7.0;
        const dist = getDistance(x1, y1, x2, y2);
        expect(dist).toEqual(`16.4575`);
    })

    it("should return 12.3065", () => {
        const x1 = -2.5;
        const y1 = 0.4;
        const x2 = -12.1;
        const y2 = -7.3;
        const dist = getDistance(x1, y1, x2, y2);
        expect(dist).toEqual(`12.3065`);
    })

    it("should return 6.0000", () => {
        const x1 = -2.1;
        const y1 = 2.5;
        const x2 = -2.1;
        const y2 = -3.5;
        const dist = getDistance(x1, y1, x2, y2);
        expect(dist).toEqual(`6.0000`);
    })
})