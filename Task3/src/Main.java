import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int wrightAnswers = 0;
        String [] questions = new String[] {
                "2 + 2 = ?     1) - 4, 2) - 5, 3) - 9",
                "2 * 3 = ?     1) - 4, 2) - 1, 3) - 6",
                "3 * 3 = ?     1) - 4, 2) - 9, 3) - 5"
        };
        String  [] answers = new String[] {
                "1",
                "3",
                "2"
        };

        for(int i = 0; i < questions.length ; i++) {
            System.out.println(questions[i]);
            String answer = in.next();
            if(( answer.equals(answers[i]))) {
                wrightAnswers++;
            }
        }

        System.out.println("You took " + wrightAnswers + " from " + questions.length);
    }
}
