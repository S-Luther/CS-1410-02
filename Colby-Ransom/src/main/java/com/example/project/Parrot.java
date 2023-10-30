public class Parrot {
    //perfect!
    public Parrot(String name = "Parrot", String mood = "happy", int energy = 1){
        Parrot.name = name;
        Parrot.mood = mood;
        Parrot.energy = energy;
    }
    private talk(Parrot p){
        p.energy +=1;
        p.mood = "talkative";

    }
    private changeName(Parrot p, String newName){
        p.name = newName;
    }
}