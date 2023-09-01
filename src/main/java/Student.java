public class Student {

    private String vorname;
    private String nachname;
    private int matrikelnummer;

    public Student(String vorname, String nachname, int matrikelnummer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.matrikelnummer = matrikelnummer;
    }

    // Getter und Setter für die Eigenschaften
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    @Override
    public String toString() {
        return "Student{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", matrikelnummer=" + matrikelnummer +
                '}';
    }

}
