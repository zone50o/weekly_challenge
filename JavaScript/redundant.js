function redundant(input){
    return function() {return input;};
}

let f1 = redundant("apple");
let f2 = redundant("pear");
let f3 = redundant("");

console.log(f1());
console.log(f2());
console.log(f3());