public class Vector3 {
    int[] elemen; 

    public Vector3(int x, int y, int z) {
        elemen = new int[3]; 
        elemen[0] = x;
        elemen[1] = y;
        elemen[2] = z;
    }

    // Perkalian vektor dengan skalar
    public Vector3 multiply(int skalar) {
        return new Vector3(elemen[0] * skalar, elemen[1] * skalar, elemen[2] * skalar);
    }

    // Perkalian vektor dengan vektor 
    public int multiply(Vector3 other) {
        return (elemen[0] * other.elemen[0]) + 
               (elemen[1] * other.elemen[1]) + 
               (elemen[2] * other.elemen[2]);
    }
}
