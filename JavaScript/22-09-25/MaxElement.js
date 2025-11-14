let arr = [5, 2, 9, 1, 7];
let max = arr[0];

for (let i of arr) {
    if (max < i) {
        max = i;
    }
}

console.log(max);
