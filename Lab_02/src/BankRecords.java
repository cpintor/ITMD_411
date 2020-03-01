import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

public class BankRecords extends Client{ // Extending Abstract class and Overriding abstract methods
    ArrayList<StringBuffer> list; // ArrayList Collection of type StringBuffer to store each record

    // Instance fields
    private String id;
    private int age;
    private String sex;
    private String region;
    private double income;
    private String married;
    private int children;
    private String car;
    private String save_act;
    private String current_act;
    private String mortgage;
    private String pep;

    // Setters and getters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getSave_act() {
        return save_act;
    }

    public void setSave_act(String save_act) {
        this.save_act = save_act;
    }

    public String getCurrent_act() {
        return current_act;
    }

    public void setCurrent_act(String current_act) {
        this.current_act = current_act;
    }

    public String getMortgage() {
        return mortgage;
    }

    public void setMortgage(String mortgage) {
        this.mortgage = mortgage;
    }

    public String getPep() {
        return pep;
    }

    public void setPep(String pep) {
        this.pep = pep;
    }

    public void readData() {
        try{
            list = new ArrayList<StringBuffer>(); // Creating object for ArrayList
            FileReader fr = new FileReader("bank-Detail.csv"); // Reading File bank-Details from root of project folder
            BufferedReader br = new BufferedReader(fr); // Passing FileReader into BufferedReader
            String line;

            while((line=br.readLine())!=null){ // Accessing each record
                StringBuffer sb = new StringBuffer();
                sb.append(line); // Appending to StringBuffer
                list.add(sb); // Adding to ArrayList
            }
        } catch(Exception e){
            e.printStackTrace(); // Catching Exception
        }
    }

    public void processData() {
        Iterator<StringBuffer> itr = list.iterator(); // Processing ArrayList using Iterator
        int idx=0;
        while(itr.hasNext()){ // Iterating each record from list
            if(idx==25){
                break;
            }
            StringBuffer sb = itr.next();
            String col[] = sb.toString().split(","); // Splitting each attribute with comma seperator
            this.setId(col[0]); // Setting each value to Setters
            this.setAge(Integer.parseInt(col[1]));
            this.setSex(col[2]);
            this.setRegion(col[3]);
            this.setIncome(Double.parseDouble(col[4]));
            this.setMortgage(col[10]);
            this.printData(); // Calling printData for every record
            idx++;
        }
    }

    public void printData() { // Printing records
        System.out.println(this.getId()+" "+this.getAge()+" "+this.getSex()+" "+this.getRegion()+" "+this.getIncome()+" "+this.getMortgage());

    }
}