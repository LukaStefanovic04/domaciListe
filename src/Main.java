import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> sviStudenti = new ArrayList<>();
        List<Student> uspesniStudenti = new ArrayList<>();
        while (true) {
            System.out.println("Unesite ime studenta: ");
            String ime = scanner.next();
            if (ime.equals("quit")) {
                break;
            }
            System.out.println("Unesite prezime studenta:");
            String prezime = scanner.next();
            System.out.println("Unesite ocenu studenta:  ");
            int ocena = scanner.nextInt();
            if (ocena == 5 || ocena == 6 || ocena == 7 || ocena == 9) {
                Student student = new Student(ime, prezime, ocena);
                sviStudenti.add(student);
                if (ocena > 5) {
                    uspesniStudenti.add(student);
                }
            } else {
                System.out.println("Uneli ste neispravnu ocenu.");
            }
        }

        System.out.println("Svi studenti:");
        for (Student student : sviStudenti) {
            System.out.println(student);
        }

        System.out.println("Studenti koji su polozili: ");
        for (Student student : uspesniStudenti) {
            System.out.println(student);
        }

    }
}