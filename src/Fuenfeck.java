public class Fuenfeck extends Pyramide{
    private float s;

    public Fuenfeck(float hoehe, float s) {
        super(hoehe);
        this.s = s;
    }

    @Override
    public float calcVolumen() {
        return (float) ((1.0f / 3.0f) * 0.25*(Math.sqrt(5*(5+2*Math.sqrt(5))) *s * super.getHoehe()));
    }
}

