package Inherrited;

public class PersegiPanjang extends BangunDatar {
    float p, le;

    public PersegiPanjang(float p, float le) {
        this.p = p;
        this.le = le;
    }

    public float L() {
        return p * le;
    }

    public float K() {
        return 2 * (p + le);
    }
}
    
