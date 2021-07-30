function buyTickets() {

    $('#ticketNotFound').text ()
    $('#numberNotFound').text("")
    $('#nameNotFound').text("")
    $('#surnameNotFound').text("")
    $('#phoneNotFound').text("")
    $('#emailNotFound').text("")



    const ticket = $("#ticket").val();
    const number = $("#number").val();
    const firstname = $("#firstname").val();
    const surname = $("#surname").val();
    const phoneno = $("#phoneno").val();
    const email = $("#email").val();

    gotError = false;
console.log(ticket);
    //Overhalet if else og la til sjekk på tall for antall og telefon


    if (ticket === null){
        console.log("lol");
        $("#ticketNotFound").text("*Vennligst velg film")
        gotError = true;
    }

    if (number === "") {
        $("#numberNotFound").text("* Antall billetter må velges ")
        gotError = true;
    } else if (isNaN(parseInt(number))) {
        $("#numberNotFound").text("* Antall må være et tall")
        errorExist = true;
    }

    if (firstname === "") {
        $("#nameNotFound").text("* Fornavn må skrives inn");
        gotError = true;
    }

    if (surname === "") {
        $("#surnameNotFound").text("* Etternavn må skrives inn");
        gotError = true;
    }

    if (phoneno === "") {
        $("#phoneNotFound").text("* Telefonnummer må skrives inn");
        gotError = true;
    } else if (isNaN(parseInt(phoneno))) {
        $("#phoneNotFound").text("* Telefonnummer må bestå av tall");
        gotError = true;
    }

    if (email === "") {
        $("#emailNotFound").text("* Epost må skrives inn")
        gotError = true;
    }

    const movieTicket = {
        ticket: ticket,
        number: number,
        firstname: firstname,
        surname: surname,
        phoneno: phoneno,
        email: email,
    }

    if (!gotError) {
        $.post("/add", movieTicket, function () {
        })
        document.forms[0].reset()
        window.location.href = "index.html";
    }
}

$(function () {
    getAllTickets();

})

function getAllTickets() {
    $.get("/get", function (data) {
        printTicket(data);
    })
}

function printTicket(tickets) {
    let ut = "<table class='table'<tr>" +
        "<th>Film</th><th>Antall</th><th>Navn</th><th>Etternavn</th><th>Epost</th><th>Telefonnr.</th>";

    for (const Ticket of tickets) {
        ut += "<tr>";
        ut += "<td>" + Ticket.ticket + "</td><td>" + Ticket.number + "</td><td>" + Ticket.firstname + "</td><td>"
            + Ticket.surname + "</td> <td>" + Ticket.email + "</td><td>" + Ticket.phoneno + "</td>";
        ut += "</tr>";
    }
    ut += "</table>"
    $("#utBillett").html(ut);
}

function deleteTickets() {
    const confirmed = confirm("Er du sikker på at du vil slette alle valgte billetter?")
    if (confirmed) {
        $.get("/delete", function () {
            getAllTickets();
            // kilder brukt og lagret for egenhjelp:
            //https://craftpip.github.io/jquery-confirm/
            // https://api.jquery.com/
        })
    }
}


