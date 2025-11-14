let btn=document.querySelector("button");

btn.addEventListener("click",()=>{
    let h2=document.querySelector("h2");
    console.log(h2.innerText);
    h2.innerText="clicked";
});