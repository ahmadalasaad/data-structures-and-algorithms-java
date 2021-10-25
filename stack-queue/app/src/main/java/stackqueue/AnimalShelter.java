package stackqueue;

public  class AnimalShelter {
    private Queue Animals=new Queue();

    public void enqueue(Animal animal){
            Animals.enqueue(animal);
    }
    public String dequeue(){
        Node pref=Animals.front;
        if(Animals.isEmpty()){
            return "already empty";
        }
        if(pref.value instanceof Dog){
            Animals.dequeue();
            return "dog";
        }
        if(pref.value instanceof Cat){
            Animals.dequeue();
            return "cat";
        }
        return "NO";
    }

    public Queue getAnimals() {
        return Animals;
    }

    public void setAnimals(Queue animals) {
        Animals = animals;
    }

    @Override
    public String toString() {
        return Animals.toString();
    }
}
