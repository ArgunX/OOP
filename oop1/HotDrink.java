package oop.oop1;

public class HotDrink extends Product{
    protected double volume;
    protected int temperature;
    

    public HotDrink() {
        super();
    }

    public HotDrink(String name, int cost, double volume, int temperature) {
        super(name,cost);
        this.volume = volume;
        this.temperature = temperature;
    }
    public HotDrink(double volume, int temperature){
        super();
        this.volume = volume;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{"+
                "name = " + super.getName() + ' ' +
                " cost = " + super.getCost() +' ' +
                " volume = " + this.getVolume() +' '+
                " temperature=" + temperature +
                '}'+'\n';
    }


    public double getVolume() {
        return this.volume;
    }

    public int getTemperature() {
        return this.temperature;
    }



    
}
