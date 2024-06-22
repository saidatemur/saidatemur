import static java.lang.Math.sqrt;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public String toString(){
       return "x="+this.x+", "+"y="+this.y;
    }
    public double distanceFromPoint(Point t){
        return sqrt((this.x- t.x)*(this.x- t.x)+(this.y- t.y)*(this.y- t.y));

    }
    public int getX(){
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
