import java.time.LocalDate;
import java.time.Period;

public class Passport {
    private LocalDate dateOfBirth;
    private String country;
    private char gender;

    public Passport(LocalDate dateOfBirth, String country, char gender) {
        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.gender = gender;
    }
    public Passport(){
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "dateOfBirth=" + dateOfBirth +
                ", country='" + country + '\'' +
                ", gender=" + gender +
                '}';
    }
}
