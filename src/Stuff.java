import com.company.Person;

public class Stuff extends Person {
    String school;
    double pay;

    public Stuff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return String.format("Stuff[%s,school=%s,pay=%f]",super.toString(),school,pay);
    }
}
