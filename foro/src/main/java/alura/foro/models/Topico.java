package alura.foro.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity(name = "Topico")
@Table(name = "topicos")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String titulo;

    @Column
    private String mensaje;

    @Column
    private LocalDateTime fechaCreacion = LocalDateTime.now();

    @Column
    private String status ="NO_RESPONDIDO";

    @Column
    private String autor;

    @Column
    private String curso;

}
