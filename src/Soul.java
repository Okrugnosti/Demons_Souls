// базовый интерфейс с характеристиками персонажей
public abstract class Soul {

    private String name = "name_none"; // Имя существа
    private int level = 0; // Уровень (от 1 до бесконечности) - влияет на максимальное здоровье и урон игрока


    /*
           L1: if (ex < 250)
           L2: if (ex < 250*2)
           L3: if (ex < 250*3)
           ...
    */


    private int experience = 0; // Опыт (от 0 до 250) - очки опыта за убийство монстра
    private int vitality = 0; // Максимальный лимит Единиц_жизни (от 0 до 10 000)
    private int real_vitality = 0; //Текущее значение лимита жизни (не более vitality)
    private int damage = 0; // Урон (от 0 до 3 000)
    private int critical_strike_chance = 0; // (от 0 до 100) шанс критического удара
    // вероятность увеличения максимального урона x2
    private int agility = 0; // ловкость (от 0 до 33) - увеличение вероятность успеха атаки
    private int money = 0; // Монеты (золото) - награда за убийство монстров


    //базовый конструктор параметров объекта
    public Soul(String name, int level, int experience,
                int vitality, int damage, int critical_strike_chance,
                int agility, int money) {
        this.name = name;
        this.level = level;
        this.experience = experience;
        this.vitality = vitality;
        this.real_vitality = vitality - 30;
        this.damage = damage;
        this.critical_strike_chance = critical_strike_chance;
        this.agility = agility;
        this.money = money;
    }

    // вывод параметров персонажа
    public void get_param_soul() {
        System.out.println("Name : " + this.name);
        System.out.println("Level : " + this.level);
        System.out.println("Experience : " + this.experience);
        System.out.println("Vitality : " + this.vitality);
        System.out.println("Real_Vitality : " + this.real_vitality);
        System.out.println("Damage : " + this.damage);
        System.out.println("Critical_strike_chance : " + this.critical_strike_chance);
        System.out.println("Agility : " + this.agility);
        System.out.println("Money : " + this.money + "\n");

    }


    // ** ПАЧКА СЕТТЕРОВ **

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public void setReal_vitalityVitality(int real_vitality) {
        this.real_vitality = real_vitality;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setCritical_strike_chance(int critical_strike_chance) {
        this.critical_strike_chance = critical_strike_chance;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    // ** ПАЧКА ГЕТТЕРОВ **

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public int getVitality() {
        return vitality;
    }

    public int getReal_vitalityVitality() {
        return real_vitality;
    }

    public int getDamage() {
        return damage;
    }

    public int getCritical_strike_chance() {
        return critical_strike_chance;
    }

    public int getAgility() {
        return agility;
    }

    public int getMoney() {
        return money;
    }

}