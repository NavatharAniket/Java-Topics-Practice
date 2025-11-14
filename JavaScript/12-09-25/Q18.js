/*Q18. Write a java program to find the first and last digit of a number.
*/

let num = 12345;
let last = num % 10;
let first = num;

while (first >= 10) {
    first = Math.floor(first / 10);
}

console.log("First:", first);
console.log("Last:", last);
