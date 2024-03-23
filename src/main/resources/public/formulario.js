function loadGetMsg() {
    let usuario = document.getElementById("user").value;
    let contrasena = document.getElementById("password").value;
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function() {
        document.getElementById("getrespmsg").innerHTML = this.responseText;
    }
    xhttp.open("POST", "https://localhost:5000/login?user=" + usuario + "&password=" + contrasena);
    xhttp.send();
}
