function getVowelSubstrings(vowelInput = ""){
    let arr = new Set();
    let vowelIndex =[];
    for(let i = 0; i <vowelInput.length;i++){
        switch(vowelInput.charAt(i).toLowerCase()){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                vowelIndex.push(i);
                arr.add(vowelInput.charAt(i));
                break;
            default:
                break;
        }
    }

    for(let x = 0; x < vowelIndex.length-1; x++){
        for(let y = x+1; y<vowelIndex.length;y++){
                arr.add(vowelInput.substring(vowelIndex[x], vowelIndex[y] + 1));
        }
    }


    return Array.from(arr).sort();
}

console.log(getVowelSubstrings("apple"));
console.log(getVowelSubstrings("aviation"));
console.log(getVowelSubstrings("hmm"));

function getConsonantSubstrings(consonantInput = ""){
    let arr = new Set();
    let consonantIndex =[];
    for(let i = 0; i <consonantInput.length;i++){
        switch(consonantInput.charAt(i).toLowerCase()){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                break;
            default:
                consonantIndex.push(i);
                arr.add(consonantInput.charAt(i));
                break;
        }
    }

    if(consonantIndex.length>1){
        for(let x = 0; x < consonantIndex.length-1; x++){
            for(let y = x+1; y<consonantIndex.length;y++){
                arr.add(consonantInput.substring(consonantIndex[x], consonantIndex[y] + 1));
            } 
        }
    }

    return  Array.from(arr).sort();
}

console.log(getConsonantSubstrings("aviation"));
console.log(getConsonantSubstrings("motor"));