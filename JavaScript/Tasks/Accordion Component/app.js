let btn=document.getElementsByClassName("btn")[0];
console.log(btn);

btn.addEventListener("click",()=>{
    let p=document.getElementsByClassName("hide")[0];
    console.log(p);

    if(btn.innerHTML=="Read More")
    {
        p.style.display="block";
        btn.innerHTML="Hide";
    }
    else
    {
        p.style.display="none";
        btn.innerHTML="Read More";
    }
    console.log(btn.innerHTML);
});
