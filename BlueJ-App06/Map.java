import java.util.ArrayList;
/**
 * Write a description of class Map here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

/** THIS IS A TEST DELETE THIS LINE */
public class Map
{
    private Room outside;
    private Room revolutions, pub, lab, office, house;
    private Room startRoom;

    public Map()
    {
        createRooms();
        startRoom = outside; //Game starts outside
    }
    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        Room outside, revolutions, pub, lab, office, house;

        // create the rooms
        outside = new Room("outside the main entrance of the university");
        revolutions = new Room("in rev's Beaconsfield");
        pub = new Room("in the campus pub");
        lab = new Room("in a computing lab");
        office = new Room("in the computing admin office");
        house = new Room("At your house, you've made it home");

        // initialise room exits
        outside.setExit("east", revolutions);
        outside.setExit("south", lab);
        outside.setExit("west", pub);
        outside.setExit("north", house);

        revolutions.setExit("west", outside);

        pub.setExit("east", outside);

        lab.setExit("north", outside);
        lab.setExit("east", office);

        office.setExit("west", lab);
        
    }

}
