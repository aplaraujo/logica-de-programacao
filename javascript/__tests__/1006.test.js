import getAverage from "../src/1006";

describe("1006", () => {
    it("should return 'MEDIA = 6.3'", () => {
        const n1 = 5.0;
        const n2 = 6.0;
        const n3 = 7.0;
        const media = getAverage(n1, n2, n3);
        expect(media).toEqual(`MEDIA = 6.3`);
    })

    it("should return 'MEDIA = 9.0'", () => {
        const n1 = 5.0;
        const n2 = 10.0;
        const n3 = 10.0;
        const media = getAverage(n1, n2, n3);
        expect(media).toEqual(`MEDIA = 9.0`);
    })

    it("should return 'MEDIA = 7.5'", () => {
        const n1 = 10.0;
        const n2 = 10.0;
        const n3 = 5.0;
        const media = getAverage(n1, n2, n3);
        expect(media).toEqual(`MEDIA = 7.5`);
    })

    it("should return 'MEDIA = 7.5'", () => {
        const n1 = 7.5;
        const n2 = 7.5;
        const n3 = 7.5;
        const media = getAverage(n1, n2, n3);
        expect(media).toEqual(`MEDIA = 7.5`);
    })

    it("should return 'MEDIA = 7.4'", () => {
        const n1 = 6.7;
        const n2 = 8.5;
        const n3 = 7.0;
        const media = getAverage(n1, n2, n3);
        expect(media).toEqual(`MEDIA = 7.4`);
    })
})