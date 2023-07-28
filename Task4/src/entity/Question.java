package entity;

public class Question {
    int number;
    String text;
    Option[] options;

    public Question(int number, String text, Option[] options) {
        this.number = number;
        this.text = text;
        this.options = options;
    }

    public void print() {
        System.out.println(text);
        for (int i = 0; i < options.length; i++) {
            options[i].print();
        }
    }

    public boolean isRight(int num) {
        for (int i = 0; i < options.length; i++) {
            if(options[i].number == num) {
                return  options[i].isRight;
            }
        }
        return false;
    }
}
