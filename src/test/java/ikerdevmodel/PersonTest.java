package ikerdevmodel;

import java.time.Year;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for {@link Person}.
 */
class PersonTest {

    private static final int BIRTH_YEAR = 1990;

    @Test
    void calculaLaEdadCorrectamenteSegunElAnioDeNacimiento() {
        Person person = new Person("Iker", "Ardura", "12345678A", BIRTH_YEAR);

        int edadEsperada = Year.now().getValue() - BIRTH_YEAR;
        assertEquals(edadEsperada, person.getEdad());
    }

    @Test
    void devuelveElNombreCorrectamente() {
        Person person = new Person("Iker", "Ardura", "12345678A", BIRTH_YEAR);
        assertEquals("Iker", person.getFirstName());
    }

    @Test
    void devuelveElApellidoCorrectamente() {
        Person person = new Person("Iker", "Ardura", "12345678A", BIRTH_YEAR);
        assertEquals("Ardura", person.getLastName());
    }

    @Test
    void devuelveElDocumentoDeIdentidadCorrectamente() {
        Person person = new Person("Iker", "Ardura", "12345678A", BIRTH_YEAR);
        assertEquals("12345678A", person.getDocumentId());
    }

    @Test
    void devuelveElAnioDeNacimientoCorrectamente() {
        Person person = new Person("Iker", "Ardura", "12345678A", BIRTH_YEAR);
        assertEquals(BIRTH_YEAR, person.getBirthYear());
    }
}
