
public class Main{

    public static void main(String [] args){
        // ******************************************* [ Product ] ******************************* \\
        Product2 product2 = new Product2("MackbookM4", 1.599 , 1);
        // Product2 ni OBJ xolatda chaqarib olyapmiz va Buyurtma beryapmiz


        // Getter lar
        // Endi Men Nomini get qilib olyaman prduct2 class dan
        System.out.println("Nomi  = " + product2.getName());

        // Va Narxi ni ham get qilib olyaman double xolatda product class dan
        System.out.println("Narxi =  " + product2.getPrice());

        // Va 1,599 Buyurtma ni endi integer xolatda get qilib chaqiramiz product class dan
        System.out.println("Buyurtma nechtaligi  = "+ product2.getPid());


        //Setter lar
        // Men product2 class dan OBJ olib undan price set qilib olyapman yani puldi o'zgartiryapman
        product2.setPrice(93600);

        // Va Kelyotgan Buyurtmani Sonini O'zgartiryapman set
        product2.setPid(2);

        // Endi men Yangi kirgizgan Buyurtmani Product2 OBJ orqali class ichidan  get dan chaqiryapman
        System.out.println("Yangi Buyurtma = " +  product2.getPid());


        // Endi Teskarisini  qilamiz yani Product orqaga qaytaramniz

        System.out.println();
        System.out.println("******************** [ Return ] ********************");
        // Buyurtmani -1 ga kamaytiryapmiz
        product2.setPid(-1);

        // Price dan -936000 dan minus ayriyapman
        product2.setPid(-963000);
        System.out.println("*****************************************************");
        System.out.println();
        System.out.println("*********************************************************************************");
        //**************************************************************************************************************
        System.out.println();

        // Address
        Address2 address = new Address2("O'zbekiston", "Andijon", "Sanot MFY", "Ozodlik", "0369");
        address.toString();
        System.out.println();
        //O'zgartiramiz City
        address.setCity("Sanot MFY");

        System.out.println();
        System.out.println("********************** [ Return ] ********************");
        //O'zgartiramiz State
        address.setState("Baxt");
        // Endi Address set bilan o'zgardi endi va get bilan outputga chaqiramiz
        System.out.println("Yangi Address2 = " +  address.getCity());
        System.out.println("Yangi Address2 = " +  address.getState());
        System.out.println("*******************************************************");
        System.out.println();

        //**************************** [ PaymetCard ] ***************************** \\

        System.out.println("****************************** [ PaymetCard ] ********************************");
        // Endi PaymetCard dan Password oy/kun va raqam kerak
        PaymetCard2 paymetCard2 = new PaymetCard2("20091158", "06.09","230");


        System.out.println();

        System.out.println("********************** [ Return ] ********************");
        // Tekshirish uchun Password noldan boshidan qo'ymamiz
        paymetCard2.setCardPassword("96325103");

        // Va yana sanasini O'zgartiramiz
        paymetCard2.setCardCVC("08.13");

        // Endi CVC di o'zgartiramiz
        paymetCard2.setCardNumber("350");
        System.out.println("*******************************************************");

        System.out.println();
        System.out.println("*****************************************************************************");
        System.out.println();

        // ********************************** [ Customer ] ********************************* \\

        // Customer class di chiqaramiz va Customer qilamiz yani foydanaluvchi tarafdan kiritilyapti
        Customer customer = new Customer("Otabek", "rahimjonovotabek780@gmail.com", "2009", "+998916153013");

        customer.toString();

        // Setter Endi Tekshirish uchun O'zgartiramiz

        System.out.println();
        System.out.println("************************ [ Return ] **********************");
        customer.setCustomerEmail("rahimjonovotabek780gmail.com");

        // Setter Password
        customer.setCustomerPassword("2000900");

        // Setter Phone
        customer.setCustomerPhone("998916153013");

        System.out.println("**********************************************************");
        System.out.println();

        //************************************* [ Order ] ************************************** \\
        System.out.println("*********************************** [ Order ] *******************************");
        // Order dan endi Jamlaymiz product qoshamiz va customer di ham qoshamiz
        Order order = new Order(1, product2, customer,2);

        // Endi outputga chiqarmiz
        System.out.println(order);
        System.out.println("*****************************************************************************");
        System.out.println();

        //****************************** [ Finance ] ****************************\\
        System.out.println("******************************** [ Finance ] *********************************");
        // FinanceTracker obyektini yaratamiz
        FinanceTracker tracker = new FinanceTracker();

        // Yangi tranzaksiyalarni qo'shamiz
        tracker.addTransaction(new Transaction("Mackbook", "M3", 3000000));
        tracker.addTransaction(new Transaction("Mackbook", "M4", 500000));
        tracker.addTransaction(new Transaction("Mackbook", "M2", 100000));

        // Tranzaksiyalarni chiqaramiz
        tracker.showTransactions();
        System.out.println("Balans: " + tracker.getBalance() + " so'm");
    }
}