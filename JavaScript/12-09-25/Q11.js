/*
Q11. Write a java program to calculate the sum of digits of a number.
*/


let num=10101;
let digit=0;
while(num>0)
{
	digit+=Math.floor(num%10);
	num=Math.floor(num/10);
}

console.log(digit);