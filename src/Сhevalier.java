// класс для игрока-рыцаря
class Chevalier extends Soul {

    //базовый конструктор параметров объекта
    Chevalier() {
        super("Chevalier",
                1,
                0,
                200,
                30,
                20,
                20,
                1000);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

}