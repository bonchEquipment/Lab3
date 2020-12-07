package pack;

public class Story {

    public static void main(String[] args) {
        Story storyAboutShorties = new Story();
        World moon = new World("Луна");
        Neznayka neznayka = new Neznayka("Незнайка");
        Kozlik kozlik = new Kozlik("Козлик");
        NewspaperSeller newspaperSeller = new NewspaperSeller("Продавец газет");
        storyAboutShorties.tellStory(neznayka, kozlik, newspaperSeller, moon);

    }

    public void tellStory(Shorty actor1, Shorty actor2, Shorty actor3, World planet) {
        planet.addWalker(actor1, World.Location.ДОМ);
        planet.addWalker(actor2, World.Location.ДОМ);
        planet.addWalker(actor3, World.Location.УЛИЦА);
        actor1.wakeUp();
        actor2.wakeUp();
        actor1.lookAround();
        actor1.eat();
        actor2.eat();
        actor1.goTo(World.Location.УЛИЦА);
        actor2.goTo(World.Location.УЛИЦА);
        actor3.say("Самые свежие газеты на луне!");
        actor1.lookAround();
        actor1.buy("Газета");
        actor1.read();
    }
}


