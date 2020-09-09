package ru.mirea.pr2;

public class Ball {
    private double x=0.0;
    private double y=0.0;
public Ball(double x, double y){
    this.x=x;
    this.y=y;
}
public Ball(){
    x=1.0;
    y=2.5;
}

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double X,double Y){
    x=X;
    y=Y;
    }
    public void move(double xDisp, double yDisp){
    x=x+xDisp;
    y=y+yDisp;
    }
    public String toString(){
    return "X: "+this.x+" |Y:"+this.y;
    }
}
