package Inherrited;

public class Persegi extends BangunDatar {
    float s;
    public Persegi(float s) {
        this.s = s;
    }

    public float L() {
        return s * s;
    }

    public float K() {
        return 4 * s;
    }
}
    
