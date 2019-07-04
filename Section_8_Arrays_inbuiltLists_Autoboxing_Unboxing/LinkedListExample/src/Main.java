import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
	    Album album = new Album("Stormbringer", "Deep Purple");
	    album.addSong("Stormbringer1", 4.6);
        album.addSong("Stormbringer2", 3.2);
        album.addSong("Stormbringer3", 4.9);
        album.addSong("Stormbringer4", 4.0);
        album.addSong("Stormbringer5", 2.4);
        album.addSong("Stormbringer6", 1.0);
        album.addSong("Stormbringer7", 3.57);
        album.addSong("Stormbringer8", 3.32);
        album.addSong("Stormbringer9", 2.4);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("track1", 3.2);
        album.addSong("track2", 3.1);
        album.addSong("track3", 2.57);
        album.addSong("track4", 4.3);
        album.addSong("track5", 4.1);
        album.addSong("track6", 3.7);
        album.addSong("track7", 3.5);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(1).addToPlaylist("track1", playList);
        albums.get(0).addToPlaylist("Stormbringer8", playList);
        albums.get(0).addToPlaylist("track12", playList); // does not exist
        albums.get(0).addToPlaylist(6, playList);
        albums.get(1).addToPlaylist(6, playList);
        albums.get(1).addToPlaylist(22, playList); // does not exist

        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                        } else {
                            System.out.println("We are at start of playlist");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the playlist");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;

            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions: \npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("==============");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("==============");
    }
}
