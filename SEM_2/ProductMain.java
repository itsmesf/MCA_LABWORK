class Product{
    private String p_company;
    private String p_name;

    public Product(String p_company,String p_name){
        this.p_company = p_company;
        this.p_name = p_name;
    }

    public String getP_company () {
        return p_company;
    }

    public String getP_name () {
        return p_name;
    }

    public void setP_company ( String p_company ) {
        this.p_company = p_company;
    }

    public void setP_name ( String p_name ) {
        this.p_name = p_name;
    }
}

class Bag extends Product{
    private String B_type;
    public Bag(String p_company,String p_name, String B_type){
        super(p_company,p_name);
        this.B_type = B_type;
    }

    public String getB_type () {
        return B_type;
    }

    public void setB_type ( String b_type ) {
        B_type = b_type;
    }
}


public class ProductMain {
    public static void main ( String[] args ) {
        Bag b1 = new Bag ( "Lavie" , "Bag" , "Leather" );
        Bag b2 = new Bag("Fastrack" , "Bag" , "Cloth");
        Bag b3 = new Bag("Sky" , "Bag" , "Faux Leather");

        Bag[] b = {b1,b2,b3};

        for(int i = 0 ; i < b.length; i++){
            if(b[i].getB_type ().equalsIgnoreCase ( "Leather" )){
                System.out.println ( b[i].getP_company ());
                System.out.println ( b[i].getP_name ());
            }
        }
    }
}
