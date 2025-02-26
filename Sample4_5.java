public class Sample4_5 {
    public static void main(String[] args) {
        Car car1;
        car1 = new RacingCar();

        car1.setCar(1234, 20.5);

        car1.show();
    }
}

class Car {
    protected int num;
    protected double gas;

    public Car() {
        this.num = 0;
        this.gas = 0.0;
        System.out.println("生產了車子");
    }

    public void setCar(int n, double g) {
        this.num = n;
        this.gas = g;
        System.out.println("將車號設為" + this.num + "，汽油量設為" + this.gas);
    }

    public void show() {
        System.out.println("車號是" + this.num);
        System.out.println("汽油量是" + this.gas);
    }
}

class RacingCar extends Car {
    private int course;

    public RacingCar() {
        this.course = 0;
        System.out.println("生產了賽車");
    }

    public void setCourse(int c) {
        this.course = c;
        System.out.println("將賽車編號設為" + this.course);
    }

    @Override
    public void show() {
        System.out.println("賽車的車號是" + this.num);
        System.out.println("汽油量是" + this.gas);
        System.out.println("賽車編號是" + this.course);
    }
}