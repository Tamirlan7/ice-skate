package by.tami.ticketservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "t_ticket")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {

    /* ticket model */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "payment_id", nullable = false)
    private Long paymentId;

    @Column(name = "season_id", nullable = false)
    private Long seasonId;

    @Column(name = "adults_quantity", nullable = false)
    private Integer adultsQuantity = 0;

    @Column(name = "students_quantity", nullable = false)
    private Integer studentsQuantity = 0;

    @Column(name = "children_quantity", nullable = false)
    private Integer childrenQuantity = 0;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
}
