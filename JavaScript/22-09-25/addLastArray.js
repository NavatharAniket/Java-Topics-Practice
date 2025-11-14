let arr = [2, 3, 4];
let newElement = 1;


arr[arr.length] = 0;  
for (let i = arr.length - 1; i > 0; i--) {
    arr[i] = arr[i - 1];
}

arr[0] = newElement;

console.log(arr);
