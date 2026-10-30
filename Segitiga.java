package Inherrited;


public class Segitiga extends BangunDatar {
    float als, t;
    float sA, sB, sC;

    public Segitiga(float als, float t) {
        this.als = als;
        this.t = t;
        this.sA = als;
        this.sB = (float) Math.sqrt((als/2)*(als/2) + (t*t));
        this.sC = this.sB;
    }

    public float L() {
        return 0.5f * als * t;
    }

    public float K() {
        return sA + sB + sC;
    }
}

