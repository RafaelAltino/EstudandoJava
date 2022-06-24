public class Triangulo implements FiguraGeometrica{
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String getNomeFigura() {
        return "Triângulo";
    }

    @Override
    public int getArea() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getPerimetro() {
        return (a + b+ c);
    }
    
}
