let arr = [5, 2, 9, 1, 7];
let min = arr[0];

for (let i of arr) {
    if (min > i) {
        min = i;
    }
}

console.log(min);
