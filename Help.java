import java.util.Scanner;
import java.lang.Thread;

public class Help {
    public void help() throws InterruptedException {
        while (true) {
            System.out.print("\u001B[33m");
            System.out.print("""
                    The basis of Age of Empires IV RPG, like its predecessors, is straightforward: gather resources, and use those resources to train military units.\s
                                    
                    As you grow your civilization, your objective is to face your opponent with the full force of your empire – and emerge victorious.\s
                                    
                    In Age of Empires IV, you can achieve victory if:\s
                                    
                    You can destroy your enemy army and win over his army.
                    """);
            Thread.sleep(10000);
            System.out.println("\u001B[0mWanna go back to main menu? 'y'ES/'n'O :- ");
            Scanner input = new Scanner(System.in);
            char inp = input.next().charAt(0);
            if(inp == 'y') {
                break;
            }
            else if(inp == 'n'){
                continue;
            }

            else {
                System.out.println("Wrong input!");
            }
        }
    }
}
