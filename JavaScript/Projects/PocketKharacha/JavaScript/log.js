let btn=document.getElementById("submit");

btn.addEventListener("click",()=>{
    let name = document.getElementById("UserName").value.trim();
  let number = document.getElementById("UserNumber").value.trim();
  let pass1 = document.getElementById("pass1").value.trim();

  if(localStorage.getItem(name)===name)
  {
    if(localStorage.getItem(number)===number)
    {
        if(localStorage.getItem(pass1)===pass1)
        {
            window.location.href="../HTML/Account.html";
        }
        else
        {
            console.log("Invalid Creditials");
        }
    }
    else
    {
        alert("Invalid Creditials");
    }
  }
  else{
    alert("Invalid Creditials");
  }
});