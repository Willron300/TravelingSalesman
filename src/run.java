public class run {
    public static void main(String[] args){
        Kreis kreis = new Kreis();
        ConfigWay way = new ConfigWay(kreis.points);
        System.out.println(way.absa);
    }
}
