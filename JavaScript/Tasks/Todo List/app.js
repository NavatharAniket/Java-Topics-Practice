let add = document.querySelector("#add");

add.addEventListener("click", () => {
    let text = prompt("Enter task to add");
    if (!text) return; 

    let table = document.querySelector("table");
    let tr = document.createElement("tr");
    let td=document.createElement("td");
    let removetd=document.createElement("td");
    table.appendChild(tr);
    td.innerHTML = text;
    console.log(tr);
    tr.appendChild(td);
    let rm = document.createElement("button");
    rm.innerText = "Remove";
    rm.setAttribute("onclick", "removeItem(event)");
    removetd.append(rm);
    tr.appendChild(removetd);
    console.log(td);
});

let removeButtons = document.getElementsByClassName("remove");
for(let i=0; i<removeButtons.length; i++){
    removeButtons[i].addEventListener("click",removeItem);
}


function removeItem(e){
        e.target.parentElement.parentElement.remove();
}