package NewCat;

public class Cat {
    private String name;
    private String color;


    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public Cat() {
        this.name = "Kiril";
    }

    public String getColor() {
        return color;
    }
    

    public void setColor(String color){
        this.color = "blue";
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }



    public void sayMquuu(){
        System.out.printf("Cat %s said: Mquuu!%n 54541", name);
    }



    public static void main(String[] args) {
        Cat cat = new Cat();
        //cat.name = "Pisi";

        cat.sayMquuu();
    }
}
