public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo();
        Triangolo triangolo= new Triangolo();

        System.out.println("Area della Forma");
        forma.calcolaArea();

        System.out.println("Area del Rettangolo");
        rettangolo.calcolaArea();
        System.out.println("Area del Triangolo");
        triangolo.calcolaArea();
    }
}