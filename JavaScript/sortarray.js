// By Using No_inbuilt Methods Descending Order

let x = [100,10,1,2,20,200]
for (let i = 0; i < x.length; i++) {
    for (let j = 0; j < x.length; j++) {
        if (x[j] < x[j + 1]) {
            let temp = x[j]
            x[j] = x[j + 1]
            x[j + 1] = temp
        }
    }
}
let y = []
for (let i = 0; i < x.length; i++) {
    y[i] = x[i]
}
console.log(y);


// By Using inbuilt Methods Descending Order
let z = [100,10,1,2,20,200]
let c = z.sort((a, b) => {
    return b - a
})
console.log(c);