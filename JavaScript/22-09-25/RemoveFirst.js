let arr=[5, 6, 7, 8];

for(let i=0;i<arr.length-1;i++)
{
	let temp=arr[0];
	arr[i]=arr[i+1];
	arr[i+1]=temp;
}
arr.length=arr.length-1;
console.log(arr);