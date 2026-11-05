public class Customer{

    private String CustomerLastName;
    private String CustomerEmail;
    private String CustomerPassword;
    private String CustomerPhone;

    public Customer( String CustomerLastName, String CustomerEmail, String CustomerPassword, String CustomerPhone){
        this.CustomerLastName = CustomerLastName;
        setCustomerEmail (CustomerEmail);
        setCustomerPassword (CustomerPassword);
        setCustomerPhone (CustomerPhone);
    }

    public String getCustomerLastName() {
        return CustomerLastName;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }
    public void setCustomerEmail(String CustomerEmail) {
        if(CustomerEmail.contains("@")){
            System.out.println("************************* [ Customer ] ****************************");
            System.out.println("Customer Email ✔️ = " + CustomerEmail);
        }else{
            System.out.println("Sizni Emailgizda @ belgisi yo'q >= " +  CustomerEmail);
        }
    }

    public String getCustomerPassword() {
        return CustomerPassword;
    }
    public void setCustomerPassword(String CustomerPassword) {
        if(CustomerPassword.length() < 6){
            System.out.println("Password Correct ✔️ = " + CustomerPassword);
        }else {
            System.out.println("Password Xato siz 5 tadan ortiq son yozdingiz = " + CustomerPassword);
        }
    }

    public String getCustomerPhone() {
        return CustomerPhone;
    }
    public void setCustomerPhone(String CustomerPhone) {
        if(CustomerPhone.contains("+")){
            if(CustomerPhone.length() != 12){
                System.out.println("Phone Number Correct ✔️  = " + CustomerPhone);
            }
        }else{
            System.out.println("Sizning Telefon nomerigizda + Belgisi yo'q >= " + CustomerPhone);
        }
    }

    public String toString() {
        System.out.println("Customer Last Name : " + CustomerLastName);
        System.out.println("*****************************************************************");
        return CustomerLastName ;
    }


}