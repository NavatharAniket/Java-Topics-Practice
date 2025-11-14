let arr=[1, 2, 3, 4, 5];

for(let i=1;i<arr.length;i++)
{
	if(arr[i]<arr[i-1])
	{
		console.log("not sorted");
	}
}