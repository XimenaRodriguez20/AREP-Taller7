function loadMs() {
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function() {
        const response = JSON.parse(this.responseText); // Suponiendo que la respuesta es un JSON
        console.log(response);
        let html = "<ul>";
        response.forEach(function(fruit) {
            html += "<li>" + fruit + "</li>";
        });
        html += "</ul>";
        document.getElementById("fuitslist").innerHTML = html;
    }
    xhttp.open("GET", "https://localhost:4000/fruits");
    xhttp.send();
}

function redireccionar() {
    window.location.href = "https://localhost:5000/formulario.html";
}