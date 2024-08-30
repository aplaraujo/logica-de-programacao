import { getFuelQuantity } from "../src/1017";

describe("1017", () => {
    it("should return 70.833", () => {
        const vm = 85;
        const t = 10;
        const fuelQuantity = getFuelQuantity(vm, t);
        expect(fuelQuantity).toEqual("70.833");
    })

    it("should return 15.333", () => {
        const vm = 92;
        const t = 2;
        const fuelQuantity = getFuelQuantity(vm, t);
        expect(fuelQuantity).toEqual("15.333");
    })

    it("should return 122.833", () => {
        const vm = 22;
        const t = 67;
        const fuelQuantity = getFuelQuantity(vm, t);
        expect(fuelQuantity).toEqual("122.833");
    })

    it("should return 112.500", () => {
        const vm = 90;
        const t = 15;
        const fuelQuantity = getFuelQuantity(vm, t);
        expect(fuelQuantity).toEqual("112.500");
    })
})