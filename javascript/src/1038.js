export const getTotal = (code, quantity) => {
    let total;
    if (code === 1) {
        total = quantity * 4.00;
    }
    if (code === 2) {
        total = quantity * 4.50;
    }
    if (code === 3) {
        total = quantity * 5.00;
    }
    if (code === 4) {
        total = quantity * 2.00;
    }
    if (code === 5) {
        total = quantity * 1.50;
    }
    return `Total: R$ ${total.toFixed(2)}`
}