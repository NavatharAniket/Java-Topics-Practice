let arr = [1, 4, 7, 12];

let start=0;
let end=arr.length-1;
while(start<end)
{
	if(arr[start]+arr[end]==11)
	{
		console.log(arr[start]+" "+arr[end]);
		break;
	}
	else if(arr[start]+arr[end]>11)
	{
		end--;
	}
	else
	{
		start++;
	}
}