public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Pablo");
        person.setSpeed(100);
        person.setId(1);

        Zombie zombie = new Zombie();
        zombie.setLevelInfection(5);
        zombie.setHeight(101);

        Zombie zombie1 = new Zombie();
        zombie1.setLevelInfection(5);
        zombie1.setHeight(101);

        ToDoAndPrint(zombie1);
        ToDoAndPrint(person);

        System.out.println(person);
        System.out.println(zombie);
        System.out.println(zombie1);
    }

    static void ToDoAndPrint(Humanoid humanoid){
        humanoid.setId(-1);
        System.out.println(humanoid);
    }
}

class Humanoid{
    protected int id;
    protected int height = 175;
    protected int speed;
    protected int damage;

    @Override
    public String toString() {
        return "Humanoid{" +
                "id=" + id +
                ", height=" + height +
                ", speed=" + speed +
                ", damage=" + damage +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}

class Person extends Humanoid{
    private String name = "Bob";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", height=" + height +
                ", speed=" + speed +
                ", damage=" + damage +
                '}';
    }
}

class Zombie extends Humanoid {
    private int levelInfection = 0;

    public int getLevelInfection() {
        return levelInfection;
    }

    public void setLevelInfection(int levelInfection) {
        this.levelInfection = levelInfection;
    }

    @Override
    public String toString() {
        return "Zombie{" +
                "levelInfection=" + levelInfection +
                ", id=" + id +
                ", height=" + height +
                ", speed=" + speed +
                ", damage=" + damage +
                '}';
    }
    public void setId(int id) {
        this.id = id;
    }
}
