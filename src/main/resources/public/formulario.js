function loadGetMsg() {
    let usuario = document.getElementById("user").value;
    let contrasena = document.getElementById("password").value;
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function() {
        if (this.responseText == "Datos incorrectos") {
            document.getElementById("getrespmsg").innerHTML = this.responseText;
        } else {
            // Redirect to Google
            //document.documentElement.innerHTML = this.responseText;
            window.location.href = "https://localhost:4000/frutas.html";
        }

    }
    xhttp.open("POST", "https://localhost:5000/login?user=" + usuario + "&password=" + contrasena);
    xhttp.send();
}
