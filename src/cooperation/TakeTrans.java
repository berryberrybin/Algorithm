package cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student studentA = new Student("A",5000);
        Student studentB= new Student("B",10000);

        Bus bus100 =new Bus(100);
        studentA.takeBus(bus100);
        studentA.showInfo();
        bus100.showInfo();

        Subway subwayGreen = new Subway("2호선");
        studentB.takeSubway(subwayGreen);
        studentB.showInfo();
        subwayGreen.showInfo();
    }


}
