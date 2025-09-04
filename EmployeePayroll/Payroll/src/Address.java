public class Address {

    private String line1;
    private String line2;
    private  int postalCode;
    private String cityName;

    // Constructor to store values
    public Address( String line1 , String line2 ,int postalCode, String cityName ) {
        this.postalCode = postalCode;
        this.cityName = cityName;
        this.line2 = line2;
        this.line1 = line1;
    }
    // zero argument constructor for flexibility

    public Address(){}
    public void setLine1(String line1){
        this.line1 = line1;
    }
    public String getLine1(){
        return line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    // overriding to string for accessibility
    @Override
    public String toString() {
        return "Address{" +
                "line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                ", postalCode=" + postalCode +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
