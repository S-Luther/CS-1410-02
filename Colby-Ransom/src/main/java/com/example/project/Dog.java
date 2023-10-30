public class Dog {
    public Dog(String name = "dog", String mood = "happy", int energy = 1){
        Dog.name = name;
        Dog.mood = mood;
        Dog.energy = energy;
    }
    private goOnWalk(Dog d){
        d.energy +=1;
        d.mood = "happy";

    }
    private changeName(Dog d, String newName){
        d.name = newName;
    }
}
