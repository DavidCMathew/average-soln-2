public class Average {

    public static double mean(double[] data) {
        System.out.println("}");
        double t = 0.0;
        for (double d : data) {
            t+=d;
        }
        t/=data.length;
        return t;
    }

}