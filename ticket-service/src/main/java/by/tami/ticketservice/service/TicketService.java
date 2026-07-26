package by.tami.ticketservice.service;

import by.tami.ticketservice.repository.TicketRepository;
import by.tami.ticketservice.dto.PurchaseTicketArgs;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TicketService {

    private TicketRepository ticketRepository;

    public Object purchaseTicket(PurchaseTicketArgs args) {
        return null;
    }

}
