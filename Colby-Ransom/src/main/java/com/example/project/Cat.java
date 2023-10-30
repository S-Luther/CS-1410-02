public class Cat {
    public Cat(String name = "Cat", String mood = "sleepy", int energy = 0){
        Cat.name = name;
        Cat.mood = mood;
        Cat.energy = energy;
    }
    private talk(Cat c){
        if (c.energy <=0){
            c.energy = 0;
            c.mood = "angry";
        }else if(c.energy == 1){
            c.energy -=1;
            c.mood = "sleepy";
        }else{
            c.energy -=1;
            c.mood = "happy"
        }
        
    }
    private changeName(Cat c, String newName){
        c.name = newName;
    }
    private sleep(Cat c){
        c.energy +=1;
        c.mood = "happy";

    }
}
