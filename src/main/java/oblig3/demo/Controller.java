package oblig3.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class Controller {

    @Autowired
    private KundeRepository rep;

    @PostMapping("/add")
    public void addNewTicket(Kinobillett innKinobillett) {
        rep.lagreKinobillett(innKinobillett);
    }

    @GetMapping("/get")
    public List<Kinobillett> get() {
        return rep.getAllTickets();
    }

    @GetMapping("/delete")
    public void deleteTicket() {
        rep.deleteAllTickets();
    }
}
