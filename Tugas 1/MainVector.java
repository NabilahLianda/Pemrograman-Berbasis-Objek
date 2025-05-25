public class MainVector{
    public static void main(String[] args) {
        Vector3 v1 = new Vector3(1, 2, 3);
        Vector3 v2 = new Vector3(4, 5, 6);
        int skalar = 5;
        
        // Perkalian dengan skalar
        Vector3 hasil1 = v1.multiply(skalar); 
        System.out.println("Hasil perkalian vektor dengan skalar:\n[" + v1.elemen[0] + "," + v1.elemen[1] + "," + v1.elemen[2] + "] * " + skalar + " = [" + hasil1.elemen[0] + ", " + hasil1.elemen[1] + ", " + hasil1.elemen[2] + "]");
    
        // Perkalian dengan vektor 
        int hasil2 = v1.multiply(v2);
        System.out.println("Hasil perkalian vektor dengan vektor:\n[" + v1.elemen[0] + "," + v1.elemen[1] + "," + v1.elemen[2] + "] * [" + v2.elemen[0] + "," + v2.elemen[1] + "," + v2.elemen[2] + "] = " + v1.elemen[0] + "*" + v2.elemen[0] + " + " + v1.elemen[1] + "*" + v2.elemen[1] + " + " + v1.elemen[2] + "*" + v2.elemen[2] + " = " + hasil2);
    }
    
}