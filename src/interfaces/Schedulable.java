package interfaces;

public interface Schedulable {
    boolean checkAvailability(String date);
    void schedule(String patientName, String date);
    void cancelSchedule(String date);
}
