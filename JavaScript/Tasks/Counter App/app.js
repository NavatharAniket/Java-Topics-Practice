let clear=document.querySelector("#clear");
let decrease=document.querySelector("#decrease");
let increase=document.querySelector("#increase");
let h1=document.querySelector("h1");
let n=parseInt(h1.innerText);
increase.addEventListener("click",()=>{
    n++;
    h1.innerHTML=n;
});
decrease.addEventListener("click",()=>{
    n--;
    h1.innerHTML=n;
});
clear.addEventListener("click",()=>{
    n=0;
    h1.innerHTML=n;
});