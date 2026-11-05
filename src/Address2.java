public class Address2 {
    private String address;
    private String Street;
    private String City;
    private String State;
    private String Zipcode;

    public Address2() {
        address = "";
        Street = "";
        City = "";
        State = "";
        Zipcode = "";
    }
    public Address2(String address, String Street, String City, String State, String Zipcode) {
        this.address = address;
        this.Street = Street;
        this.City = City;
        this.State = State;
        this.Zipcode = Zipcode;
    }

    public Address2(String toshkent, String amirTemur, String number) {
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        if(address!=null && !address.isEmpty()){
            this.address = address;
        }
    }

    public String getStreet() {
        return Street;
    }
    public void setStreet(String street){
        if(street!=null && !street.isEmpty()){
            this.Street = street;
        }
    }

    public String getCity() {
        return City;
    }
    public  void setCity(String city) {
        if(city!=null && !city.isEmpty()){
            this.City = city;
        }
    }

    public String getState() {
        return State;
    }
    public void  setState(String state) {
        if(state!=null && !state.isEmpty()){
            this.State = state;
        }
    }

    public String getZipcode() {
        return Zipcode;
    }
    public void  setZipcode(String zipcode) {
        if(zipcode!=null && !zipcode.isEmpty()){
            this.Zipcode = zipcode;
        }
    }

    public String toString(){
        System.out.println("****************************** [ Adress ] **************************************");
        System.out.println("Address : "+address);
        System.out.println("Street : "+Street);
        System.out.println("City : "+City);
        System.out.println("State : "+State);
        System.out.println("Zipcode : "+Zipcode);
        System.out.println("*********************************************************************************");
        return Zipcode;
    }
}
