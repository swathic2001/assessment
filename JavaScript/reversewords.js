function reverseWord(s) {
    let rs = '';
    let word = '';
    let isWord = false;

    for (let i = 0; i < s.length; i++) {
        const char = s[i];

        if (char !== ' ') {
            word = char + word;
            isWord = true;
        } else if (isWord) {
            rs += word + ' ';
            word = '';
            isWord = false;
        }
    }
    if (isWord) {
        rs += word;
    }
    return rs;
}
const input = "This is a sunny day";
const rs = reverseWord(input);
console.log(rs); 