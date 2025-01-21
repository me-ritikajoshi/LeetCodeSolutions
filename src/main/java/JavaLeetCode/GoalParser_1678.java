package JavaLeetCode;

public class GoalParser_1678 {
    public static void main(String[] args) {
        String command="G()(al)";
        System.out.println(interpret(command));
    }
    public static String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}
