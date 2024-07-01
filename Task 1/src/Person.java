public class Person {
    private String name;
    private String job;
    private String placeOfJob;
    private int age;
    private int money;

    public Person(String name, String job, String placeOfJob, int age, int money) {
        this.name = name;
        this.job = job;
        this.placeOfJob = placeOfJob;
        this.age = age;
        this.money = money;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPlaceOfJob() {
        return placeOfJob;
    }

    public void setPlaceOfJob(String placeOfJob) {
        this.placeOfJob = placeOfJob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
