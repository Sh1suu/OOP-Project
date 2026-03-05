import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SIMPLE RPG BATTLE ===");
        System.out.println("1. Start Game");
        System.out.println("2. Exit");
        System.out.print("Choose: ");
        
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            startGame();
        } else {
            System.out.println("Goodbye!");
        }
        
        scanner.close();
    }
}
