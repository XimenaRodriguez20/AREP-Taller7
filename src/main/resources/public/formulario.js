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
            window.location.href = "https://ec2-100-24-70-251.compute-1.amazonaws.com:4000/frutas.html";
        }

    }
    xhttp.open("POST", "https://ec2-204-236-255-199.compute-1.amazonaws.com:5000/login?user=" + usuario + "&password=" + contrasena);
    xhttp.send();
}
