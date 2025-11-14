let arr = [10, 20, 40];
let element = 30;
let position = 2; 

position = position - 1; 
arr[arr.length] = 0;  

for (let i = arr.length - 1; i > position; i--) {
    arr[i] = arr[i - 1];
}

arr[position] = element;

console.log(arr);
