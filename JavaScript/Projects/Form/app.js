let btn=document.querySelector("button");

btn.addEventListener("click",(e)=>{
    e.preventDefault();
    
    let name=document.getElementById("name").value;
    let email=document.getElementById("email").value;
    let number=document.getElementById("number").value;
    let pass1=document.getElementById("pass1").value;
    let pass2=document.getElementById("pass2").value;

    if (!name || !email || !number || !pass1 || !pass2) {
        alert("Please fill in all fields!");
        return;
    }

    if (pass1 !== pass2) {
        alert("Passwords do not match!");
        return;
    }

    
});

