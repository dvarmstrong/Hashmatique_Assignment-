import java.util.*;

public class tracks {
    public static void main(String[] args) {
        
        // create a HashMap for tracklist and lyrics 

        HashMap<String, String> trackList = new HashMap<String, String>();

        // Use put to insert track titles and sample lyrics 

        trackList.put("Smells Like Teen Spirit", "Here we are now entertain us" );
        trackList.put("Come As You Are", "Come as you are, as you were");
        trackList.put("Heart-Shaped Box", "She eyes me like a Pisces when I am weak");
        trackList.put("The man who sold he world", "With the man who sold the world");

        // Pull out one song by title 

        String name = trackList.get("Come As You Are");
        System.out.println(name);

        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));

        }
    }
}
