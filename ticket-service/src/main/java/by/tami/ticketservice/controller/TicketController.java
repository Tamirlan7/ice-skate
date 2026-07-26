package by.tami.ticketservice.controller;

import by.tami.ticketservice.dto.PurchaseTicketArgs;
import by.tami.ticketservice.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/tickets")
public class TicketController {

    private TicketService ticketService;

    @PostMapping("/purchase")
    public ResponseEntity<?> purchaseTicket(
            @RequestBody PurchaseTicketArgs args
    ) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ticketService.purchaseTicket(args));
    }

}
