public class KreisBasisPyramide extends Pyramide{
    private float raduis;
    private double pi = 3.14;
    public KreisBasisPyramide(float hoehe, float raduis) {
        super(hoehe);
        this.raduis = raduis;
    }

    public float getRaduis() {
        return raduis;
    }

    @Override
    public float calcVolumen(){
        float vol;
        vol=(float) (pi*Math.pow(this.getRaduis(),2)+pi*this.getRaduis()*Math.sqrt(Math.pow(this.getRaduis(),2)+ Math.pow(this.getHoehe(),2)));
        return vol;
    }

}
