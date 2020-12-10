import java.util.ArrayList;
/**
 * Write a description of class Map here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Map
{
    private Room outside;
    private Room revolutions, antelope, queenshead, butlers;
    private Room startRoom;

    public Map()
    {
        createRooms();
        startRoom = outside; //Game starts outside
    }
    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms() {
        Room outside, revolutions, antelope, queenshead, butlers, house;

        // create the rooms
        outside = new Room("outside the main entrance of the university");
        //sets the description for when user is outside//
        outside.setDescription("You are in the middle of four pubs, the bouncers don't look very friendly");

        //all of the rooms//
        revolutions = new Room("in rev's, the floors sticky");

        antelope = new Room("the bouncer doesn't even ask for ID!");

        queenshead = new Room("//");

        butlers = new Room("they serve pizza in here");
        butlers.setItem(Items.PIZZA);

        connectOutside();
        connectRevolutions();
    }


    // initialise room exits
    private void connectOutside()
    {
        outside.setExit("north", butlers);
        outside.setExit("east", revolutions);
        outside.setExit("south", antelope);
        outside.setExit("west", queenshead);
    }

    private void connectRevolutions()
    {
        revolutions.setExit("west", outside);
    }
    private void connectAntelope()
    {
        antelope.setExit("east", outside);
    }
    private void connectQueenshead()
    {
        queenshead.setExit("north", outside);
    }
    private void connectButlers() {
        butlers.setExit("west", outside);
    }


    }

}
