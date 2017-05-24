
package ObjectOriented;


public class TamGiac {

    private Point A;
    private Point B;
    private Point C;

    
    public TamGiac(){
        
        A = new Point(4,3);
        B = new Point(-3,5);
        C = new Point(4,9);
    }
    
    public double AB(){
        double a,b;
        a = B.getX() - A.getX();
        b = B.getY() - A.getY();
        return  Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));
    }
    
    public double AC(){
        double a,b;
        a = C.getX() - A.getX();
        b = C.getY() - A.getY();
        return  Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));
    }
    
    public double BC(){
        double a,b;
        a = C.getX() - B.getX();
        b = C.getY() - B.getY();
        return  Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));
    }

   
    public double dienTich(){
        double s,a,b;
        a = (B.getX()- A.getX())* (C.getY()-A.getY()) ; 
        b = (C.getX()-A.getX())*(B.getY()-A.getY());
        s = a- b;
        return (Math.abs(s)/2);
    }
    
    public double chuVi(){
        return AB() + AC() + BC();
    }
    
    
    public static void main(String[] args) {
        TamGiac tamGiac = new TamGiac();
        System.out.println("Dien tich tam giac la: "+ tamGiac.dienTich());
        System.out.println("Chu vi tam giac la: "+ tamGiac.chuVi());
    }





 class Point {
    private double x;
    private double y;
    
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
}
}

