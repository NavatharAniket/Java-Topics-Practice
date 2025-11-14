let s=document.getElementsByClassName("s");

for (let button of s) {
  button.addEventListener("click", () => {
    window.location.href = "../HTML/Sign.html";
  });
}