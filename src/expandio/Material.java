package expandio;

public class Material {

    public Material(int id, String name, double coeficient){
        this.id = id; this.name = name; this.coeficient = coeficient;
    }

    private final int id;

    private final double coeficient;

    private final String name;

    public int getId(){
        return id;
    }

    public double getCoeficient(){
        return coeficient;
    }

    public String getName(){
        return name;
    }

    public double calculate(){
        return 0;
    }
}
