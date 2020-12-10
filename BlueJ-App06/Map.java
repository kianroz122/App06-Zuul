import java.util.ArrayList;
/**
 * Write a description of class Map here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Map
{
    private Room square;
    private Room revolutions, antelope, queenshead, butlers, greyhound;
    private Room startRoom;

    public Map()
    {
        createRooms();
        startRoom = square; //Game starts outside
    }
    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms() {
        Room square, revolutions, antelope, queenshead, butlers, house;

        // create the rooms
        square = new Room("A pub in each direction, which do you visit first?");
        //sets the description for when user is outside//
        square.setDescription("You are in the town square, in the middle of four pubs, the bouncers don't look very friendly");

        //all of the rooms//
        revolutions = new Room("in rev's, the floors sticky");

        antelope = new Room("the bouncer doesn't even ask for ID!");

        queenshead = new Room("//");

        butlers = new Room("they serve pizza in here");
        butlers.setItem(Items.PIZZA);

        greyhound = new Room("//");

        trafalgar = new Room("//");


        connectSquare();
        connectRevolutions();
        connectQueenshead();
        connectButlers();
        connectGreyhound();
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

//The antelope goes north back to the square or south to greyhound

    private void connectAntelope()
    {
        antelope.setExit("north", square);
        antelope.setExit("south" greyhound);
        antelope.setExit("east" trafalgar);
    }

    private void connectGreyhound() {
        greyhound.setExit("north", antelope);
        greyhound.setExit("west" queenvic);
        greyhound.setExit("south" lordnelson);
    }

    private void connectTrafalgar()
    {
        trafalgar.setExit("west", antelope);
        trafalgar.setExit("south", threecrown);
    }
}








