// класс для монстров-гоблин
public class Goblin extends Soul {

    public Goblin() {
        super("Goblin",
                1,
                50,
                100,
                25,
                15,
                15,
                50);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
