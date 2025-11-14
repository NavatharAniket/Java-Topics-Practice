let arr=[2, 5, 6, 7, 8];
let even=0;
let odd=0;

for(let i of arr)
{
	if(i%2==0)
	{
		even++;
	}
	else
	{
		odd++;
	}
}

console.log(even+" "+odd);