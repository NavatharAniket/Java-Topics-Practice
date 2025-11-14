let arr=[1, 2, 3, 4, 5, 6];

let brr=arr.map((val)=>{
	return val*val;
}).filter((k)=>{
	return k>10;
});

console.log(brr);