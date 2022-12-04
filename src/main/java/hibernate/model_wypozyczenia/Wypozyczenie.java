package hibernate.model_wypozyczenia;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class Wypozyczenie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Część relacji samochod-wypozyczenie
    @ManyToOne
    @EqualsAndHashCode.Exclude
    private Samochod samochodX;
    // Część relacji klient-wypozyczenie
    @ManyToOne
    @EqualsAndHashCode.Exclude
    private Samochod klientY;

    // Część relacji zwrot-wypozyczenie
    @OneToOne(mappedBy = "wypozyczenieZ")
    @EqualsAndHashCode.Exclude
    private Zwrot zwrot;
}
