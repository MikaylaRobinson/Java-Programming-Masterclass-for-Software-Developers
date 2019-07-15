import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {

        // When creating a hash map, the two initial arguments passed are the data types for the keys and the values
        Map<String, String> languages = new HashMap<>();

        // Populating the HashMap
        languages.put("Java", "a compiled high level. object-oriented, platform independent language");
        languages.put("Python", "an interpreted, object-orientated, high-level programing language with dynamic semantics");
        languages.put("Algol", "algorithmic language");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        // Values can easily be called with the key
        // System.out.println(languages.get("Java"));


        // Keys are unique, if you pass a new pair in with the same key, the old value is overwritten
        languages.put("Java", "writing about Java");
        System.out.println(languages.get("Java"));

        // To prevent entries from being overwritten, you can test if they already exist
        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "A new Java definition");
        }
        System.out.println(languages.get("Java"));
        System.out.println("=================================");

        // Removing a key:value pair from a map by a key
        // languages.remove("Lisp");

        // Removing a key:value pair by both the key and the value
        if (languages.remove("Algol", "fkjhberkfjbkebfj")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Not removed, key/value pair not found");
        }

        // You can also replace values that already exist
        // Scala will not do anything since it does not already exist in the map
        // You can also replace key/value pairs dependent on both the key and the value
        // You pass the key, old value, new value. If a match is found for the key/old value, it will be replaced
        System.out.println(languages.replace("Lisp", "the old def was replaced"));
        System.out.println(languages.replace("Scala", "this should not be able to add"));

        // Viewing all pairs in the map
        for (String key : languages.keySet()) {
            System.out.println(key + " " + languages.get(key));
        }
    }
}
