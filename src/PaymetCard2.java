public class PaymetCard2 {
    private String CardPassword;
    private String CardNumber;
    private String CardCVC;

    public PaymetCard2(String CardPassword, String CardNumber, String CardCVC) {
        setCardPassword(CardPassword);
        setCardNumber(CardNumber);
        setCardCVC(CardCVC);
    }

    public String getCardPassword() {
        return CardPassword;
    }

    public void setCardPassword(String CardPassword) {
        if(CardPassword.length() <= 8){
            System.out.println("Password Correct  ✔️ = " + CardPassword);
        }else {
            System.out.println("Password Not Correct ❌ = " + CardPassword);
        }
    }

    public String getCardNumber() {
        return CardNumber;
    }
    public void setCardNumber(String CardNumber) {
        if(CardNumber.length() != 16){
            System.out.println("CardNumber Correct ✔️ = " + CardNumber);
        }else {
            System.out.println("CardNumber Not Correct ❌ = " + CardNumber);
            this.CardNumber = "00000000000000000";
        }
    }

    public String getCardCVC() {
        return CardCVC;
    }
    public void setCardCVC(String CardCVC) {
        if(CardCVC.length() != 4){
            System.out.println("CardCVC ✔️ = " + CardCVC);
        }else {
            System.out.println("Xato: CVV 3 ta raqamdan iborat bo'lishi kerak! ");
            this.CardCVC = "000";
        }
    }

    public String toString(){
        return CardPassword;
    }
}
