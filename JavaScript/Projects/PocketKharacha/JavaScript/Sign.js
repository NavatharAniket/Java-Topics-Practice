let submit = document.getElementById("submit");

submit.addEventListener("click", (event) => {
  event.preventDefault(); // stop form reload

  let name = document.getElementById("UserName").value.trim();
  let email = document.getElementById("UserGmail").value.trim();
  let number = document.getElementById("UserNumber").value.trim();
  let pass1 = document.getElementById("pass1").value.trim();
  let pass2 = document.getElementById("pass2").value.trim();

  if (!name || !email || !number || !pass1 || !pass2) {
    alert("All fields are required!");
    return;
  }

  if (localStorage.getItem(number)) {
    alert("Number is already registered!");
    window.location.href = "../HTML/log.html";
  } else {
    if (pass1 !== pass2) {
      alert("Passwords do not match!");
    } else {
      // Save user data in a structured way
      let user = {
        name: name,
        email: email,
        number: number,
        password: pass1,
      };

      // Store as JSON (keyed by phone number)
      localStorage.setItem(number, JSON.stringify(user));

      alert("Signup successful!");
      window.location.href = "../HTML/log.html";
    }
  }
});
