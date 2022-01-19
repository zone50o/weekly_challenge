function additivePersistence(input){
    let count = 0;
    while(input>10){
        sum = 0;
        while (input) {
            sum += input % 10;
            input = Math.floor(input / 10);
        }
        input = sum;
        count++
    }
    return count;
}

console.log(additivePersistence(1679583));

console.log(additivePersistence(123456));

console.log(additivePersistence(6));

function multiplicativePersistence(input){
    let count = 0;
    while(input>10){
        product = 1;
        while (input) {
            product *= input % 10;
            input = Math.floor(input / 10);
        }
        input = product;
        count++
    }
    return count;
}

console.log(multiplicativePersistence(77));

console.log(multiplicativePersistence(123456));

console.log(multiplicativePersistence(4));
