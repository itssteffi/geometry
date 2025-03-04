public class RechteckigePyramide extends Pyramide {
    private float laenge;
    private float breite;

    public RechteckigePyramide(float hoehe, float laenge, float breite) {
        super(hoehe);
        this.laenge = laenge;
        this.breite = breite;
    }

    @Override
    public float calcVolumen() {
        return (1.0f / 3.0f) * laenge * breite * super.getHoehe();
    }
}
