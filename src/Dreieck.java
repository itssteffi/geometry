public class Dreieck extends Pyramide {
    float s;

    public Dreieck(float hoehe, float s) {
        super(hoehe);
        this.s = s;
    }


    public float calcVolumen() {
        return (1.0f / 3.0f) * ((float) Math.sqrt(3) / 4) * s * s * super.getHoehe();
    }
}
