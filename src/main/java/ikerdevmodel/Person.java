package ikerdevmodel;

import java.time.Year;

/**
 * Models a person with basic identity data and calculated age.
 */
public final class Person {

    private static final int DEFAULT_YEAR_PLACEHOLDER = 1990;

    private final String firstName;
    private final String lastName;
    private final String documentId;
    private final int birthYear;

    /**
     * Creates a new Person.
     *
     * @param firstName the person's first name
     * @param lastName the person's last name
     * @param documentId the person's identity document number
     * @param birthYear the person's year of birth
     */
    public Person(String firstName, String lastName, String documentId, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.documentId = documentId;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDocumentId() {
        return documentId;
    }

    public int getBirthYear() {
        return birthYear;
    }

    /**
     * Calculates the person's current age based on their birth year.
     *
     * @return the calculated age
     */
    public int getEdad() {
        return Year.now().getValue() - birthYear;
    }

    private static final int SAMPLE_BIRTH_YEAR = 2000;

public static void main(String[] args) {
    Person person = new Person("Iker", "Arduengo", "12345678A", SAMPLE_BIRTH_YEAR);
    System.out.println("Nombre: " + person.getFirstName());
    System.out.println("Apellido: " + person.getLastName());
    System.out.println("Documento: " + person.getDocumentId());
    System.out.println("Año de nacimiento: " + person.getBirthYear());
    System.out.println("Edad: " + person.getEdad());
}
}
