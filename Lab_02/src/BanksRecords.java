import java.util.ArrayList;
import java.util.List;

public class BanksRecords {
    // setup static objects for IO processing

    // array of BankRecords objects
    static BanksRecords robjs[] = new BanksRecords[600];
    // arrayList to hold spreadsheet
    static ArrayList<List<String>> array = new ArrayList<>();

    // instance fields
    private String id;
    private int age;
    private String sex;
    private double income;
    private String married;
    private int children;
    private String car;
    private String save_act;
    private String current_act;
    private String mortgage;
    private String pep;

    // accessors and muttators
    public String getId(){
        return this.id;
    }

    public void setId(String i_d){
        this.id = i_d;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int a){
        this.age = a;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String _sex) {
        this.sex = _sex;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double _income) {
        this.income = _income;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String _married) {
        this.married = _married;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int _children) {
        this.children = _children;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String _car) {
        this.car = _car;
    }

    public String getSave_act() {
        return save_act;
    }

    public void setSave_act(String _save_act) {
        this.save_act = _save_act;
    }

    public String getCurrent_act() {
        return current_act;
    }

    public void setCurrent_act(String _current_act) {
        this.current_act = _current_act;
    }

    public String getMortgage() {
        return mortgage;
    }

    public void setMortgage(String _mortgage) {
        this.mortgage = _mortgage;
    }

    public String getPep() {
        return pep;
    }

    public void setPep(String _pep) {
        this.pep = _pep;
    }
}
