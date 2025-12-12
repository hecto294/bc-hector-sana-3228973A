package co.edu.sena.hector.sana;

public class OphthalmologyPatient extends Patient {
    private String diagnosis;

    public OphthalmologyPatient(String id, String name, int age, String diagnosis) {
        super(id, name, age);
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "OphthalmologyPatient{" +
                "id='" + id + ''' +
                ", name='" + name + ''' +
                ", age=" + age +
                ", diagnosis='" + diagnosis + ''' +
                '}';
    }
}
