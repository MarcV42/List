import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> studentenListe = new ArrayList<>();

    public void addStudent(Student student) {
        studentenListe.add(student);
    }

    // Weitere Methoden für Schritt 4 bis 6 hinzufügen
    public void printAllStudents() {
        for (Student student : studentenListe) {
            System.out.println(student);
        }
    }

    public Student findStudentById(int matrikelnummer) {
        for (Student student : studentenListe) {
            if (student.getMatrikelnummer() == matrikelnummer) {
                return student;
            }
        }
        return null; // Student nicht gefunden
    }

    public boolean removeStudent(int matrikelnummer) {
        for (Student student : studentenListe) {
            if (student.getMatrikelnummer() == matrikelnummer) {
                studentenListe.remove(student);
                return true; // Student wurde entfernt
            }
        }
        return false; // Student nicht gefunden und nicht entfernt
    }

}
