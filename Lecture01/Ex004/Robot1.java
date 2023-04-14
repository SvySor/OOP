package OOP.Lecture01.Ex004;

public class Robot1 {
    /** Уроверь робота */
    public int level;

    /** Имя робота */
    public String name;

    /**
     * Создание робота
     * 
     * @param name Имя робота !Не должно начинаться с цифры
     * @param leve Уровень робота
     */
    public Robot1(String name, int level) {
        this.name = name;
        this.level = level;
    }

    /** Загрузка BIOS */
    public void startBIOS() {
        System.out.println("Start BIOS...");
    };

    /** Загрузка OS */
    public void startOS() {
        System.out.println("Start OS...");
    };

    /** Приветствие */
    public void sayHi() {
        System.out.println("Hello world...");
    };

    /** Работа */
    public void work() {
        System.out.println("Working...");
    };


    /** Выгрузка BIOS */
    public void stopBIOS() {
        System.out.println("Stop BIOS...");
    };

    /** Выгрузка OS */
    public void stopOS() {
        System.out.println("Stop OS...");
    };

    /** Прощание */
    public void sayBuy() {
        System.out.println("Buy...");
    };

}
