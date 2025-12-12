package co.edu.sena.hector.sana;

public class LaserSurgery extends MedicalProcedure {

    public LaserSurgery() {
        super("Laser Eye Surgery");
    }

    @Override
    public String execute() {
        return "Laser surgery executed successfully.";
    }
}
