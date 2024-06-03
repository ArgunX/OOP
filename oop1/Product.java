package oop.oop1;



public abstract class Product {
  
 
    protected String name;
    protected int cost;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public Product() {
        this.name="default_name";
        this.cost=-1;

    }

    public void setName(String name) {
        this.name = name;
    }

   
    public void setCost(int cost) {
        this.cost = cost;
    }

    public Product(String name) {
        this.name=name;
        this.cost=-1;

    }    
    public Product(int cost) {
        this.name="default_name";
        this.cost=cost;
    }

    public String getName() {
        return this.name;
    }
    public int getCost() {
        return cost;
    }


}
