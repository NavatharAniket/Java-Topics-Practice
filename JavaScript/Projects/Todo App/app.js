function displayDate(){
    let date =new Date();
    date=date.toString().split(" ");
    document.querySelector(".date").innerHTML=date[1]+" "+date[2]+" "+date[3];
}


console.log(window);
window.onload=function(){
    displayDate();
}