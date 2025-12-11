public class Triangolo extends Forma{
    int base=2;
    int altezza=4;

    @Override
    public void calcolaArea() {
        int area= (base*altezza) / 2;
        System.out.println("Area triangolo:" + area);
    }
}

