 let btn=document.querySelector("button");
 btn.addEventListener("click",()=>{
    let input=document.querySelector("#input").value;
    let p=document.querySelector("p");

    p.innerHTML=input;
 })