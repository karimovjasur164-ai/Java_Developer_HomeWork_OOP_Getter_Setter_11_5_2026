public class Product2 {
    private static String Name;
    private static double Price;
    private int Pid;


    public Product2(String Name, double Price,  int Pid) {
        System.out.println("***************************************** [ Product ] ******************************");
        this.Name = Name;
        setPrice(Price);
        setPid(Pid);
    }

    public static String getName(){
        return Name;
    }

    public static double getPrice(){
        return Price;
    }
    public void setPrice(double Price){
        if(Price < 0){
            System.out.println("Price can't be negative");
            this.Price = 0;
        }else {
            this.Price = Price;
        }
    }

    public int getPid(){
        return Pid;
    }
    public void setPid(int Pid){
        if(Pid < 0){
            System.out.println("Pid can't be negative");
            this.Pid = 0;
        }else {
            this.Pid = Pid;
        }
    }

    public String toString(){
        System.out.println("Name = " +Name);
        System.out.println("*************************************************************************************");
        System.out.println();
        return  Name ;
    }
}
