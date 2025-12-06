package interfaces;

public interface Payable {
    double applyDiscount(double percentage);
    boolean isEligibleForDiscount();
    String generateInvoice();
}
