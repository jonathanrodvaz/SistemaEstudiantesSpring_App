package gm.estudiantes.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
// BoilerPlate = Codigo Repetitivo
//Para evitar codigo repetitivo, añadimos lo siguiente
//Con Data lo que hacemos es que se generen los metodos get y set de manera automatica, gracias a lombok
@Data
//Con la siguiente notacion añadimos los constructores vacios y el metodo ToString
@NoArgsConstructor
@ToString

public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstudiante;

    private String nombre;
    private String apelllido;
    private String telefono;
    private String email;

}
