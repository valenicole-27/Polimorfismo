public class Rettangolo extends Forma {
    int base= 5;
    int altezza= 6;

    @Override
    public void calcolaArea() {
        int area= base * altezza;
        System.out.println("Area rettangolo:" + area);
    }
}
