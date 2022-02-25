class City{
    String name;
    double lon;
    double lat;
    City(String n,double lo , double la){
        name=n;
        lon = lo;
        lat = la;
    }
    public void report(){
        System.out.println("City: "+name+" is at: "+lon+", "+lat);
    }
    public double distanceFrom(double lon1 , double lat1 , double lon2 , double lat2){
        long R=6371L;
        double r1= Math.toRadians(lat1);
        double r2= Math.toRadians(lat2);
        double dla = Math.toRadians(lat2-lat1);
        double dlo = Math.toRadians(lon2-lon1);
        double a = 
        Math.sin(dla/2)*Math.sin(dla/2)+Math.sin(dlo/2)*Math.sin(dlo/2)*Math.cos(r1)*Math.cos(r2);
        double c = 2*Math.atan2(Math.sqrt(a),Math.sqrt(1-a));
        double d = R*c;
        return d;
    }
}
class qn56{
    public static void main(String args[]){
        City ob1= new City("NYC",50.0,75.0);
        City ob2 = new City("Chicago",25.0,10.0);
        System.out.println("City#1");
        System.out.println("Name: "+ob1.name);
        System.out.println("Longitude: "+(int)ob1.lon);
        System.out.println("Latitude: "+(int)ob1.lat);
        System.out.println();
        System.out.println("City#2");
        System.out.println("Name: "+ob2.name);
        System.out.println("Longitude: "+(int)ob2.lon);
        System.out.println("Latitude: "+(int)ob2.lat);
        System.out.println();
        ob1.report();
        System.out.println();
        ob2.report();
        System.out.println();
        int distance=(int)ob2.distanceFrom(ob1.lon,ob1.lat,ob2.lon,ob2.lat);
        System.out.println(ob1.name+" is "+distance+" kms away from "+ob2.name);
        
    }
}