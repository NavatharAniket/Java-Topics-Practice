/*
Q14. Write a java program to check whether a number is palindrome or not.
*/

let num=1213;
let digit=0;
let j=1000;
let temp=num;
while(num>0)
{
	digit=digit+j*Math.floor(num%10);
	j=Math.floor(j/10);
	num=Math.floor(num/10);
}

if(temp==digit)
{
console.log("Yes");
}
else
{
	console.log("not");
}