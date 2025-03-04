public abstract class Pyramide {
    private float hoehe;

    public Pyramide(float hoehe) {
        this.hoehe = hoehe;
    }

    public float getHoehe() {
        return hoehe;
    }

    public abstract float calcVolumen();
}
