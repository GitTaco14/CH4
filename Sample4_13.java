public class Sample4_13 {
    public static void main(String[] args) {
        Car car1 = new Car(1234, 20.5);
        car1.vShow();
        car1.mShow();
    }
}

interface iVehicle {
    void vShow();
}

interface iMaterial {
    void mShow();
}

class Car implements iVehicle, iMaterial {
    private int num;
    private double gas;

    public Car(int n, double g) {
        this.num = n;
        this.gas = g;
        System.out.println("生產了車號為" + this.num + "，汽油量為" + this.gas + "的車子");
    }

    @Override
    public void vShow() {
        System.out.println("車號是" + this.num);
        System.out.println("汽油量是" + this.gas);
    }

    @Override
    public void mShow() {
        System.out.println("車子的材質是鐵");
    }
}