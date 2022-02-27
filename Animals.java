public class Animals {
    private String animalName;
    private String color;
    private String behave;
    private int weight;

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBehave() {
        return behave;
    }

    public void setBehave(String behave) {
        this.behave = behave;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


public Animals(String animalName, String color, String behave, int weight)
{
    this.animalName = animalName;
    this.color = color;
    this.behave = behave;
    this.weight = weight;
}
public String toString()
{
    return this.animalName  +" "+ this.color  +" "+ this.behave  +" "+ this.weight;
}

    public static void main(String[] args) {
        // Created multiple objects
        Animals Dog = new Animals("Max", "Black", "Bark", 45);
        Animals Cat = new Animals( "Daisy", "Brown","",10);
        Animals Cow = new Animals( "American Cow", "white", "Give the Milk", 200);
        Animals Elephant = new Animals( "Kaashi", "White", "Roar", 1000);
        System.out.println(Dog);
        System.out.println(Cat);
        System.out.println(Cow);
        System.out.println(Elephant);
    }
}
