import java.util.ArrayList;
import java.util.Collections;


public class PolyLine {
    private ArrayList<Point> k;
    public PolyLine(){
        this.k=new ArrayList<Point>();
    }
    public PolyLine(Line l){
        this.k=new ArrayList<Point>();
        this.addLine(l);

    }

    public void addPoint(Point p){
        k.add(p);

    }
    public void addLine(Line q){
        k.add(q.getBaslangic());
        k.add(q.getBitis());
    }
    public void addPolyLine(PolyLine r){
        k.addAll(r.getK());
    }
    public String toString(){
        StringBuilder s=new StringBuilder("[");
        for (int i = 0; i < k.size(); i++) {
            s.append(k.get(i).toString());
            if (i != k.size() - 1) {
               s.append(",");
            }
        }
        s.append("]");
        return s.toString();
    }


    public double length(){
        double topzunluk = 0.0;
        for (int i = 0; i < k.size() - 1; i += 2) {
            Point ilk = k.get(i);
            Point sonraki = k.get(i + 1);
            topzunluk += ilk.distanceFromPoint(sonraki);
        }
        return topzunluk;

    }

    public PolyLine reverse() {
        ArrayList<Point> reversedK = new ArrayList<>();
        Collections.reverse(reversedK);
        PolyLine reversedPolyLine;
        reversedPolyLine = new PolyLine();
        reversedPolyLine.setK(reversedK);
        return reversedPolyLine;
    }


    public ArrayList<Point> getK() {
        return k;
    }
    public void setK(ArrayList<Point> k) {
        this.k = k;
    }

}
