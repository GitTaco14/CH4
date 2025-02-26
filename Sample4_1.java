public class Sample4_1 {
    public static void main(String[] args) {
        RacingCar rccar1;
        rccar1 = new RacingCar();

        rccar1.setCar(1234, 20.5);

        rccar1.setCourse(5);
    }
}

class Car {
    private int num;
    private double gas;

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
}