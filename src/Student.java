public class Student {
    private String ime;
    private String prezime;
    private int ocena;

    public Student(String ime, String prezime, int ocena) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocena = ocena;
    }

    public int getOcena() {
        return ocena;
    }

    @Override
    public String toString() {
        return "Ime: " + ime + ", Prezime: " + prezime + ", Ocena: " + ocena;
    }
}
