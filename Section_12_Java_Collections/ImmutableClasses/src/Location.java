import java.util.HashMap;
import java.util.Map;

public class Location {

    // The goal of this project was to make this class immutable. This was accomplished
    // a couple of ways:
    // 1. All fields are private in this class as to not allow direct access.
    // 2. There are no setters for the variables.
    // 3. All elements are final so they can only be assigned once.
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>(exits);
        this.exits.put("Q", 0);
        this.exits.put("QUIT", 0);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
