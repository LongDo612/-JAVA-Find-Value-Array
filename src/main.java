import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        boolean check = false;
        System.out.println("Enter students name: ");
        String inputName = scanner.nextLine();
        for (int i=0;i<students.length;i++){
            if (inputName.equalsIgnoreCase(students[i])){
                check = true;
                System.out.println("Students name at: " + i);
            }
        }
        if (!check){
            System.out.println("Students name doesnt exist!");
        }
    }
}
