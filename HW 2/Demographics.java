public class Demographics {
    public static void main(String[]args)
    {
        Person person1 = new Person("Julie",42,"NJ");
        Student student1 = new Student("Brian",18,"NY","NYU");
        Worker worker1 = new Worker("Lori",50,"MA","Chef","80,000");
        System.out.println(person1.name + " "  + person1.age+" " + person1.location);
        System.out.println(student1.name + " "  + student1.age+" " + student1.location + " " + student1.university);
        System.out.println(worker1.name + " "  + worker1.age+" " + worker1.location + " " + worker1.occupation+
                " "+worker1.income);











    }
}
