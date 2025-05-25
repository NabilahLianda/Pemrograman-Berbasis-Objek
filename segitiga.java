public class segitiga {
    public static void main(String[] args) {
        int t=5;
        // for (int i=1; i<=t; i++){
        //     for (int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        for (int i=1; i<=t; i++){
            for (int j=t; j>i; j--)
            System.out.print(" ");
        }
        for (int b=1; b<=(2*i-1); b++){
            System.out.print("*");
        }
        system.out.println();
    }
}