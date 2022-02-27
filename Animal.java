public class Animal {
    private String name;
    private String breed;
    private String behave;
    private String color;

    public Animal(String name, String breed)
    {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBehave() {
        return behave;
    }

    public void setBehave(String behave) {
        this.behave = behave;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animal(String name, String breed, String behave, String color)
    {
        this.name = name;
        this.breed = breed;
        this.behave = behave;
        this.color = color;
    }

    public String toString(){
        return this.name +" "+ this.breed +" "+ this.behave +" "+ this.color;
    }

    public static void main(String[] args) {
        Animal anm1 = new Animal("Paasa","JermenSefard");
        Animal anm2 = new Animal("Max", "Pitbul", "Bark", "Golden");
        System.out.println(anm1);
        System.out.println(anm2);
    }
}
