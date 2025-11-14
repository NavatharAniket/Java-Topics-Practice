let arr = [12, 45, 2, 67, 33, 89, 21];

let max=0;
for(let i=0;i<arr.length;i++)
{
    if(max<arr[i])
    {
        max=arr[i];
    }
    
}
console.log(max);