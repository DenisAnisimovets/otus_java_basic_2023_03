import entity.Count;
import entity.Option;
import entity.Question;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Count countRight = new Count();
        Count countWrong = new Count();
        Question[] questions = new Question[]{
                new Question(1, "2 + 2 = ?",
                        new Option[]{new Option(1, "4", true),
                                new Option(2, "5", false),
                                new Option(3, "9", false)}),
                new Question(1, "2 * 3 = ?",
                        new Option[]{new Option(1, "4", false),
                                new Option(2, "1", false),
                                new Option(3, "6", true)}),
                new Question(1, "3 * 3 = ?",
                        new Option[]{new Option(1, "4", false),
                                new Option(2, "9", true),
                                new Option(3, "5", false)})
        };

        for (int i = 0; i < questions.length; i++) {
            Question question = questions[i];
            question.print();
            String answer = in.next();
            boolean isRight = question.isRight(Integer.valueOf(answer));
            if(isRight) {
                countRight.plusCount();
            } else {
                countWrong.plusCount();
            }
        }

        System.out.println("You took " + countRight.getCount() + " from " + questions.length);
    }
}
