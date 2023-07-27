package entity;

public class Option {
    int number;
    String text;
    boolean isRight;

    public Option(int number, String text, boolean isRight) {
        this.number = number;
        this.text = text;
        this.isRight = isRight;
    }

    public void print() {
        System.out.println(number + ") - " + text);
    }
}
