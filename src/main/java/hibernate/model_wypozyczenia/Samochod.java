package hibernate.model_wypozyczenia;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Samochod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marka;
    private String model;
    private String vin;
    private String nrRej;

    @OneToMany(mappedBy = "samochodX")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Wypozyczenie> wypozyczenia;
}
