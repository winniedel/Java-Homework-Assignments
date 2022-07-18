public class Worker extends Person{
    String occupation;
    String income;


    Worker(String name, int age, String location, String occupation,String income) {
        super(name,age,location);

        this.occupation = occupation;
        this.income = income;

    }

}
