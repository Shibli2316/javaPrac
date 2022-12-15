package Random.Assignment3.Q2;

public class Sphere extends Shape_3D{

    int Radius;

    public int getRadius() {
        return Radius;
    }

    public void setRadius(int Radius) {
        this.Radius = Radius;
    }

    public Sphere(int Radius, String name) {
        super(name);
        this.Radius = Radius;
    }

    @Override
    public void calArea(){
        System.out.println("SURFACE AREA OF SPHERE IS: " + 4*Math.PI*Math.pow(this.Radius, 2));
    }

    @Override
    public void calVolume(){
        System.out.println("VOLUME OF SPHERE OF IS: " + (4/3)*Math.PI*Math.pow(this.Radius, 3));
    }

}
