/*
Q17. Write a java program to find all factors of a number.
*/

let num=10;
for(let i=1;i<num;i++)
{
	if(num%i==0)
	{
		console.log(i);
	}
}