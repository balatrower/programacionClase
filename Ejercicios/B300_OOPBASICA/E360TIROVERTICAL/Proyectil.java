package B300_OOPBASICA.E360TIROVERTICAL;

public class Proyectil {
    private double posY;
    private double speed;

    final double GRAVITY = -9.81;

    public Proyectil(double speed) {
           setSpeed(speed);
           setPosY(0.0);
    }

    public double getSpeed() {
        return speed;
    }

    public double getPosY() {
        return posY;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }

    public double getGRAVITY() {
        return GRAVITY;
    }

    public void update(double dt) {
        setSpeed(getSpeed() + (getGRAVITY() * dt));
        setPosY(getPosY() + (getSpeed() * dt));
    }
}
