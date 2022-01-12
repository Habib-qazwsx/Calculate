import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MathProcessable[] handlers = {
                new Add(),
                new Power(),
                new Subtracter(),
                new Divider(),
                new Multiplier()
        };
        CalculatorEngine engine = new CalculatorEngine(handlers);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your command: ");
        String command;

        while (!command=scanner.nextLine().equals("quit")){
            try{
                String process = engine.process(command);
                System.out.println(process);
            } catch (InvalidStatementException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
