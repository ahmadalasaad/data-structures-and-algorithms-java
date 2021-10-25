package stackqueue;

public abstract class Animal {
    private String animal;
    public Animal(String animal) {
        this.animal = animal;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
}
