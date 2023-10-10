public class App {
    public static void main(String[] args){

        int[] attPlaer = {4, 6};
        int[] attGoblin = {2, 4};
        int[] attOgre = {3, 5};
        Player Raul = new Player(15, attPlaer, 2);
        Being goblin1 = new Goblin(5, attGoblin, 0);
        Being ogre1 = new Ogre(5, attOgre, 2);

        System.out.println("HP Raul: "+Raul.health+"; "+"HP goblin: "+goblin1.health+"; "+"HP ogre: "+ogre1.health);

        goblin1.attack(Raul);

        System.out.println("HP Raul: "+Raul.health+"; "+"HP goblin: "+goblin1.health+"; "+"HP ogre: "+ogre1.health);

        Raul.attack(goblin1);

        System.out.println("HP Raul: "+Raul.health+"; "+"HP goblin: "+goblin1.health+"; "+"HP ogre: "+ogre1.health);

        ogre1.attack(Raul);

        System.out.println("HP Raul: "+Raul.health+"; "+"HP goblin: "+goblin1.health+"; "+"HP ogre: "+ogre1.health);

        Raul.attack(ogre1);

        System.out.println("HP Raul: "+Raul.health+"; "+"HP goblin: "+goblin1.health+"; "+"HP ogre: "+ogre1.health);

        Raul.healing();
        Raul.healing();
        Raul.healing();
        Raul.healing();
        Raul.healing();

        System.out.println("HP Raul: "+Raul.health+"; "+"HP goblin: "+goblin1.health+"; "+"HP ogre: "+ogre1.health);
    }
}