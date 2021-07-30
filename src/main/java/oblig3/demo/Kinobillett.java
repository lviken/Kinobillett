package oblig3.demo;

public class Kinobillett {
    private String ticket;
    private String number;
    private String firstname;
    private String surname;
    private String email;
    private String phoneno;

    public Kinobillett(String ticket, String number, String firstname, String surname, String email, String phoneno) {
        this.ticket = ticket;
        this.number = number;
        this.firstname = firstname;
        this.surname = surname;
        this.email = email;
        this.phoneno = phoneno;
    }

    public Kinobillett() {}

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
}