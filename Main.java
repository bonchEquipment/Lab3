package pack;

public class Main {

    public static void main(String[] args) {
        Neznayka neznayka = new Neznayka("Незнайка", Location.ДОМ);
        NewspaperSeller seller = new NewspaperSeller("Продавец газет", Location.УЛИЦА);
        Kozlik kozlik = new Kozlik("Козлик", Location.ДОМ);
        neznayka.wakeUp();
        neznayka.lookAround();
        kozlik.wakeUp();
        neznayka.say("не хочу сегодня в школу");
        neznayka.eat();
        kozlik.eat();
        neznayka.goTo(Location.УЛИЦА);
        kozlik.goTo(Location.УЛИЦА);
        seller.say("Самые свежие газеты на луне!");
        neznayka.lookAround();
        neznayka.buy("Газету");
        neznayka.read();
    }
}
