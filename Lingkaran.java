package Inherrited;


public class Lingkaran extends BangunDatar {
    float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    public float L() {
        return (float) (Math.PI * r * r);
    }

    public float K() {
        return (float) (2 * Math.PI * r);
    }
}   

