package by.tami.ticketservice.dto;

import java.util.List;

public record PurchaseTicketArgs(
        Integer seasonId,
        Integer adultsQuantity,
        Integer studentsQuantity,
        Integer childrenQuantity,
        List<SkateRentalRequest> skateIds
) {
}
