
let btn1 = document.getElementById("Result");
let btn2 = document.getElementById("Clear");

btn1.addEventListener("click", () => {

      let num1 = parseFloat(document.getElementById("num1").value);
  let num2 = parseFloat(document.getElementById("num2").value);
    let operation = document.getElementById("operation").value;
    let Result = document.getElementById("output");
  switch (operation) {
    case "+":
      let add = num1 + num2;
     Result.value = add;
      break;
    case "-":
      let sub = num1 - num2;
      Result.value = sub;
      break;
    case "*":
      let mul = num1 * num2;
      Result.value = mul;
      break;
    case "/":
      let div = num1 / num2;
      Result.value = div;
      break;
    default:
      console.log("Enter Valid choice");
  }
});

btn2.addEventListener("click",()=>{
    let num1 = document.getElementById("num1");
  let num2 = document.getElementById("num2");
    let operation = document.getElementById("operation");
    let Result = document.getElementById("output");

    num1.value="";
    num2.value="";
    operation.value="";
    Result.value="";

})