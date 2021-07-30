package oblig3.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@SuppressWarnings("all")
public class KundeRepository {

    @Autowired
    private JdbcTemplate db;

    public void lagreKinobillett(Kinobillett innKinobillett) {
        String sql = "INSERT INTO Kinobillett (ticket, number, firstname, surname,email,phoneno)VALUES (?,?,?,?,?,?)";
        db.update(sql, innKinobillett.getTicket(), innKinobillett.getNumber(), innKinobillett.getFirstname()
                , innKinobillett.getSurname(), innKinobillett.getEmail(), innKinobillett.getPhoneno());
    }

    public List<Kinobillett> getAllTickets() {
        String sql = "SELECT * FROM Kinobillett order by surname";
        List<Kinobillett> allTickets = db.query(sql, new BeanPropertyRowMapper(Kinobillett.class));
        return allTickets;
    }

    public void deleteAllTickets() {
        String sql = "DELETE FROM Kinobillett";
        db.update(sql);
    }
}
