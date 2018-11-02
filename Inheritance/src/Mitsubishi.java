

public class Mitsubishi extends Car {

    private int serviceMonths;

    public Mitsubishi(int serviceMonths) {
        super("Mitsubishi", "4WD", 4, 6, 6, false);
        this.serviceMonths = serviceMonths;
    }

    public void accelerate(int rate) {

        int newVelocity = getCurrentVelocity() + rate;

        if (newVelocity == 0) {
            stop();
            changeCurrentGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeCurrentGear(1);
        } else if (newVelocity > 10 && newVelocity <= 30) {
            changeCurrentGear(2);
        } else if (newVelocity > 30 && newVelocity <= 60) {
            changeCurrentGear(3);
        } else if (newVelocity > 60 && newVelocity <= 100) {
            changeCurrentGear(4);
        }else if (newVelocity > 100 && newVelocity <= 150) {
            changeCurrentGear(5);
        }else if (newVelocity > 150 && newVelocity <= 200) {
            changeCurrentGear(6);
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity,getCurrentDirection());
        }

    }
}
