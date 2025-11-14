let btn=document.querySelector("button");

btn.addEventListener("click",()=>{
    let image=document.querySelector("img");
    if(btn.innerText == "hide")
    {
        image.style.display="none";
        btn.innerHTML="show";
    }
    else{
        image.style.display="block";
        btn.innerHTML="hide";
    }
});