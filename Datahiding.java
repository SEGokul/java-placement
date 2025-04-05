class Data{
    private double length ;
    private double breadth;
    

    public double getlength(){return length;}
    
    public double getbreadth(){return breadth;}

    public void setlength(double l ){
        if (l>0){length = l;}
        else {length =0;}
        }

    public void setbreadth (double b ){
        if (b>0){breadth = b;}
        else { breadth =0;}
        }

    public double area(){
        return getbreadth()*getbreadth();
    }

    public double perimeter (){
        return 2*(getlength()+getbreadth());
    }

    public boolean square(){
        if (length==breadth){return true ;}
        else return false;
    }
}

public class Datahiding {
    public static void main (String args []){
        Data rectangle = new Data();
       rectangle.setlength(10);
       rectangle.setbreadth (-5);
        System.out.println("Area:"+rectangle.area());
        System.out.println("perimeter:"+rectangle.perimeter());
        System.out.println("Issquare:"+rectangle.square());

        System.out.println("length :"+rectangle.getlength());
        System.out.println("breadth:"+rectangle.getbreadth());
    }
}