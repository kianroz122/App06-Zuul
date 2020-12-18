
/**
 * Write a description of class Map here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Map
{
    private Room square;
    private Room revolutions, antelope, queenshead, butlers, greyhound, trafalgar, threecrown, queenvic, lordnelson, harbourmaster, horseandjockey, vineyard, priory, crown, home;
    private Room startRoom;

    public Map()
    {
        createRooms();
        startRoom = square; //Game starts outside
    }
    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        // create the rooms
        square = new Room("A pub in each direction, which do you visit first?");
        //sets the description for when user is outside//
        square.setDescription("You are in the town square, in the middle of four pubs, the bouncers don't look very friendly");

        //all of the rooms//
        revolutions = new Room("in rev's, the floors sticky");
        revolutions.setDescription("//");

        queenshead = new Room("//");
        queenshead.setDescription("//");

        antelope = new Room("the bouncer doesn't even ask for ID!");
        antelope.setDescription("//");

        butlers = new Room("they serve pizza in here");
        butlers.setItem(Items.PIZZA);
        butlers.setDescription("//");

        greyhound = new Room("//");
        greyhound.setDescription("//");

        trafalgar = new Room("//");
        trafalgar.setItem(Items.CRISPS);
        trafalgar.setDescription("//");

        threecrown = new Room("//");
        threecrown.setItem(Items.GLASSOFWATER);
        threecrown.setDescription("//");

        queenvic = new Room ("//");
        queenvic.setDescription("//");

        lordnelson = new Room ("//");
        lordnelson.setDescription("//");

        harbourmaster = new Room("//");
        harbourmaster.setItem(Items.NACHOS);
        harbourmaster.setDescription("//");

        horseandjockey = new Room("//");
        horseandjockey.setDescription("//");

        priory = new Room("//");
        priory.setItem(Items.TRAFFICCONE);
        priory.setDescription("//");

        crown = new Room("//");
        crown.setItem(Items.GLASSES);
        crown.setDescription("//");

        vineyard = new Room("//");
        vineyard.setItem(Items.KEY);
        vineyard.setDescription("//");

        home = new Room("//");



//connect each room//
        connectSquare();
        connectRevolutions();
        connectQueenshead();
        connectButlers();
        connectGreyhound();
        connectTrafalgar();
        connectThreecrown();
        connectQueenvic();
        connectLordnelson();
        connectHarbourmaster();
        connectHorseandjockey();
        connectPriory();
        connectCrown();
        connectVineyard();
        connectHome();
        connectAntelope();
    }


    // initialise room exits
    private void connectSquare()
    {
        square.setExit("north", butlers);
        square.setExit("east", revolutions);
        square.setExit("south", antelope);
        square.setExit("west", queenshead);
    }

//These 3 rooms only go back to the square//

    private void connectQueenshead()
    {
        queenshead.setExit("east", square);
    }
    private void connectRevolutions()
    {
        revolutions.setExit("west", square);
    }

    private void connectButlers() {
        butlers.setExit("south", square);
    }

//The antelope goes north back to the square or south to greyhound//
    private void connectAntelope() {
        antelope.setExit("north", square);
        antelope.setExit("south", greyhound);
        antelope.setExit("east", trafalgar);
    }

//The greyhound leads north to the antelope, west to the queenvic and south to the lordnelson//
    private void connectGreyhound() {
        greyhound.setExit("north", antelope);
        greyhound.setExit("west", queenvic);
        greyhound.setExit("south", lordnelson);
    }

    private void connectTrafalgar()
    {
        trafalgar.setExit("west", antelope);
        trafalgar.setExit("south", threecrown);
    }

    private void connectThreecrown()
    {
    threecrown.setExit("north", trafalgar);
    }

    private void connectQueenvic()
    {
        queenvic.setExit("east", greyhound);
    }

    private void connectLordnelson()
    {
        lordnelson.setExit("north", greyhound);
        lordnelson.setExit("east", horseandjockey);
        lordnelson.setExit("south", vineyard);
        lordnelson.setExit("west", harbourmaster);
    }

    private void connectHarbourmaster()
    {
        harbourmaster.setExit("east", lordnelson);
    }

    private void connectHorseandjockey()
    {
        horseandjockey.setExit("west", lordnelson);
    }

    private void connectPriory()
    {
        priory.setExit("north", horseandjockey);
    }

    private void connectCrown()
    {
        crown.setExit("north", priory);
    }

    private void connectVineyard()
    {
        vineyard.setExit("north", lordnelson);
        vineyard.setExit("south", home);
    }

    private void connectHome()
    {
        home.setExit("north", vineyard);
    }



}








