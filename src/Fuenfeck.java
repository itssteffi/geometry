public class Fuenfeck extends Pyramide {
    private float s;
    public Fuenfeck(float hoehe, float s) {
        super(hoehe);
        this.s = s;
    }
    public float calcVolumen() {
        return (float) (0.25 * Math.sqrt(5*(5+2*Math.sqrt(5))) * s * s) * super.getHoehe() / 3;
    };
}
