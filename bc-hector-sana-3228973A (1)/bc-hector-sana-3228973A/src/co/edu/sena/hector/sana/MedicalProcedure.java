package co.edu.sena.hector.sana;

public abstract class MedicalProcedure {
    protected String procedureName;

    public MedicalProcedure(String procedureName) {
        this.procedureName = procedureName;
    }

    public abstract String execute();
}
