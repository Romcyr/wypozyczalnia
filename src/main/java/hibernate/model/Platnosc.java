package hibernate.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Platnosc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double kwota;
    @Enumerated(EnumType.STRING)
    private FormaPlatnosci formaPlatnosci;

    @CreationTimestamp
    private LocalDate dataRealizacji;

    @ManyToOne
    @EqualsAndHashCode.Exclude
    private  Faktura faktura;
}
