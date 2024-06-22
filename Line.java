public class Line {
    private Point baslangic;
    private Point bitis;
    public Line(Point baslangic, Point bitis){
        this.baslangic=baslangic;
        this.bitis=bitis;
    }

    public String toString(){
        String s="(x= "+baslangic.getX()+","+"y= "+baslangic.getY()+"),"+"(x= "+bitis.getX()+","+"y= "+bitis.getY()+")";
        return s;
    }
    public double length(Line w){
        //return Math.sqrt((baslangic.getX()- bitis.getX())*(baslangic.getX()- bitis.getX())+(baslangic.getY()- bitis.getY())*(baslangic.getY()- bitis.getY())(double));
        return w.baslangic.distanceFromPoint(w.bitis);
    }

    public Point getBaslangic() {
        return baslangic;
    }

    public void setBaslangic(Point baslangic) {
        this.baslangic = baslangic;
    }

    public Point getBitis() {
        return bitis;
    }

    public void setBitis(Point bitis) {
        this.bitis = bitis;
    }
}
