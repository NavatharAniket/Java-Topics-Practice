/*
Q12. Write a java program to calculate the product of digits of a number.
*/


let num=1213;
let digit=1;
while(num>0)
{
	digit*=Math.floor(num%10);
	num=Math.floor(num/10);
}

console.log(digit);