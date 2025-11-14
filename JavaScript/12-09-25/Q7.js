/*
Q7. Write a java program to find the sum of all even numbers between 1 to n.

*/

let sum=0;
let n=1;
while(n<20)
{
	if(n%2==0)
	{
		sum+=n;
	}
	n++;
}

console.log(sum);