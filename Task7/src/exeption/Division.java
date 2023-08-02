package exeption;

public class Division {

    double dividend;
    double divider;

    public Division(double dividend, double divider) {
        this.dividend = dividend;
        this.divider = divider;
    }

    public double getQuotient() {
        if(divider == 0) {
            throw new IllegalArgumentException();
        }
            else if( dividend > 0 && dividend < 0.1) {
                throw new MyException("Very small dividend");
            }
         else {
            return dividend/divider;
        }
    }
}
