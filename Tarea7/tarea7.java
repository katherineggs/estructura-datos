import java.util.LinkedList;
import java.util.Arrays;
import java.util.Random; 

public class tarea7{
    static int size = 0;
    static int index = 0;
    static String play = "";
    static String newPlay = "";
    static String listSongs = "";
    static int pointer[] = new int[size];
    static String playlist[] = new String[size];

    public static int[] addSong(String song){ //add to playlist?
        int p = 1;
        String temp[] = playlist;
        size ++;
        pointer = new int[size];
        playlist = new String[size];
        for(int i = 0; i < size -1; i++){
            playlist[i] = temp[i];
            pointer[i] = p;
            p ++;
        }
        pointer[index] = 0;
        playlist[index] = song;
        index ++;
        return pointer;
    }
    public static String playNow(){
        Random rand = new Random();
        int aleat = rand.nextInt(pointer.length); 
        play = playlist[aleat];
        return play;
    }
    public static String playNext(){
        try{
            for(int i = 0; i < playlist.length; i++){
                if(playlist[i] == (play)){
                    int ind = pointer[i];
                    newPlay = playlist[ind];
                }
            }
            play = newPlay;
            return play;
        }
        catch (Exception e){
            return "No next song";
        }
    }
    public static String playPrevious(){
        for(int i = 0; i < playlist.length; i++){
            if(playlist[i] == (play)){
                newPlay = playlist[pointer[i-1]];
            }
        }
        play = newPlay;
        return play;    
    }
    public static String listPlaylist(){
        for(int i = 0; i < pointer.length; i++){
            listSongs = listSongs + playlist[pointer[i]] + "\n";
        }
        return listSongs;
    }

    public static void main(String[] args){
        addSong("s1");
        addSong("s2");
        addSong("s3");
        addSong("s4");
        addSong("s5");
        addSong("s6");
        addSong("s7");
        addSong("s8");
        // 
        System.out.print("Playing now: ");
        System.out.println(playNow());
        System.out.print("Play next: ");
        System.out.println(playNext());
        System.out.print("Play previous fala terminar: ");
        System.out.println(playPrevious());
        System.out.println("Playlist: ");
        System.out.println(listPlaylist());
    }
}