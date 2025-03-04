public class Main {
    public static void main(String[] args) {
        KreisBasisPyramide kbp = new KreisBasisPyramide(12.222f,9.22f);
        System.out.println(kbp.calcVolumen());
        RechteckigePyramide rpyr = new RechteckigePyramide(10,2,5);
        System.out.println(rpyr.calcVolumen());

    }
}