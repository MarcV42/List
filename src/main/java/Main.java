import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentenListe = new ArrayList<>();

        Student student1 = new Student("Max", "Mustermann", 12345);
        Student student2 = new Student("Anna", "Musterfrau", 67890);
        Student student3 = new Student("Hubert", "Mustermann", 23424);
        Student student4 = new Student("Gabrielle", "Musterfrau", 535636);

        studentenListe.add(student1);
        studentenListe.add(student2);
        studentenListe.add(student3);
        studentenListe.add(student4);

        studentenListe.remove(student2);

        // Weitere Studenten hinzufügen, falls erforderlich

        // Ausgabe der Studentenliste über for each
        for (Student student : studentenListe) {
            System.out.println(student);
        }


    }

}
