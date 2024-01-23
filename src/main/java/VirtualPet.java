public class VirtualPet {
    private String name;
    private String species;
    private int hunger;
    private int thirst;
    private int happiness;

    public VirtualPet(String name, String species, int happiness, int hunger, int thirst) {
        this.name = name;
        this.species = species;
        this.happiness = happiness;
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public void feed(int feedValue) {
        hunger -= feedValue;
    }

    public void water(int waterValue) {
        thirst -= waterValue;
    }

    public void play(int playValue) {
        happiness += playValue;
    }

    public void pet() {
        happiness++;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getHappiness() {
        return happiness;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }
}
