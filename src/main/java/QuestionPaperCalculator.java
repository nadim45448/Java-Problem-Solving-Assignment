public class QuestionPaperCalculator {
    public static void main(String[] args) {
        int totalQuestion = 15;
        int totalMarks = 100;
        int marksFivePoint = 5;
        int marksTenPoint = 10;

        for (int i = 0; i<=totalQuestion; i++){
            int j = totalQuestion - i;
            if ((marksFivePoint * i + marksTenPoint * j) == totalMarks){
                System.out.println("5 mark question is " + i);
                System.out.println("10 mark question is " + j);
                break;
            }
        }
    }
}
