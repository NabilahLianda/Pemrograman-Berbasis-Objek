public class test{
    public int operate (int a, int b){
        return (a*b);
    }
    public double operate (double a, double b){
        return (a/b);
    }
    public static void main(String[] args){
        test o=new test();
        System.out.println("Hasil operate int:" +o.operate(2,3));
        System.out.println("Hasil operate double:" +o.operate(2,3));
    }
}