/*
Q10. Write a java program to count the number of digits in a number.
*/

let num=10101;
let digit=0;
while(num>0)
{
	digit++;
	num=Math.floor(num/10);
}

console.log(digit);