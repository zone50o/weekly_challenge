function isDisarium(input){
    let count = 0;
    let temp = input;
    let length = input.toString().length;
    let sum = 0;
    while (input) {
        sum += Math.pow(input%10,length-count);

        input = Math.floor(input / 10);

        count++
    }

    return temp==sum;
}

console.log(isDisarium(75));

console.log(isDisarium(135));

console.log(isDisarium(518));

console.log(isDisarium(544));

console.log(isDisarium(8));

console.log(isDisarium(466));