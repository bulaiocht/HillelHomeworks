package hometask.seven.association.entities;
import java.util.Date;
/**
 * Created by horsey on 25.01.16.
 */
public class Human {
    private String name;
    Date dateBirth;
    public enum Gender {MALE, FEMALE};
    private Gender gender;
    public enum BloodGroup {FIRST, SECOND, THIRD, FOURTH};
    private BloodGroup bloodGroup;

    public Human () {

    }

    public Human(String name, Date dateBirth, Gender gender, BloodGroup bloodGroup) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name: " + name + '\'' +
                ", dateBirth: " + dateBirth +
                ", gender: " + gender +
                ", bloodGroup: " + bloodGroup +
                '}';
    }
}
