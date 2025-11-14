/*
Q13. Write a java program to enter a number and print its reverse.

*/


let num=1213;
let digit=0;
let j=1000;
while(num>0)
{
	digit=digit+j*Math.floor(num%10);
	j=Math.floor(j/10);
	num=Math.floor(num/10);
}

console.log(digit);