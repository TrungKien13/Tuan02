public class Rabbit {
    private String color;
    private int age;
    private boolean isMale;

    public Rabbit(String color, int age, boolean isMale) {
        this.color = color;
        this.age = age;
        this.isMale = isMale;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("White", 1, true);
        System.out.println("Rabbit: Color = " + rabbit.getColor() + ", Age = " + rabbit.getAge() + ", isMale = " + rabbit.isMale());
    }
}
