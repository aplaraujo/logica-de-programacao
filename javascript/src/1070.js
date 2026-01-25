export const getOddValues = (N) => {
    const arr = [];
    const odd = [];
    arr.push(N);

    for(let i = 1; i <= 11; i++) {
        arr.push(i + N)
    }
    
    for(let i = 0; i < arr.length; i++) {
        if(arr[i] % 2 !== 0) {
            odd.push(arr[i])
        }
    }

    return odd;
}