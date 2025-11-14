let arr = [1, 2, 3, 2, 4, 1];
arr.sort((a, b) => a - b);  // [1, 1, 2, 2, 3, 4]

let duplicates = [];

let start = 0;
let end = 1;

while (end < arr.length) {
    if (arr[start] === arr[end]) {
        if (!duplicates.includes(arr[start])) {
            duplicates.push(arr[start]);
        }
    }
    start++;
    end++;
}

console.log("Duplicates:", duplicates);
