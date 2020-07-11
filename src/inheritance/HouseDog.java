package inheritance;

public class HouseDog extends Dog {
    public HouseDog(String name){
        setName(name);
    }
    public void sleep(){
        System.out.println(this.name+" zzz in house");
    }
    public void sleep(int hour){
        System.out.println(this.name + "zzz in house"+hour + "hours");
    }
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog("happy");
        houseDog.sleep();
        houseDog.sleep(3);
    }

}
