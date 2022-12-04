package hibernate.model_wypozyczenia;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Klient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToMany(mappedBy = "klientY")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Wypozyczenie> wypozyczenia;




    // IDENTITY - gdy wstawiamy rekord to:
//              - wysyłamy INSERT ... (NULL <- pozycja id)
//              - baza generuje ID
// AUTO     - różnie
// SEQUENCE - gdy wstawiamy rekord to
//              (współdzielone przez tabele)
//              (baza danych będzie posiadać tabelę: `hibernate_sequence` z kolumną `next_id`)
//              - wysyłamy select next_id z tabeli `hiberante_sequence`
//              - wysyłamy insert rekord
//              - wysyłamy update next_id na next_id+1
// TABLE    - gdy wstawiamy rekord to
//              (nie jest współdzielone, każda tabela ma oddzielny licznik)
//              (baza danych będzie posiadać tabelę: `hibernate_sequence` z kolumną `next_id`)
//              - wysyłamy select next_id z tabeli `hiberante_sequence`
//              - wysyłamy insert rekord
//              - wysyłamy update next_id na next_id+1
}
