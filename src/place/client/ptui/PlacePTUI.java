package place.client.ptui;

import place.PlaceBoard;
import place.PlaceColor;
import place.PlaceException;
import place.PlaceTile;

import java.io.PrintWriter;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class PlacePTUI extends ConsoleApplication implements Observer {

    private PlaceBoard board;

    private PlaceColor color;

    private PlaceTile tile;

    private PlaceException exception;

    @Override
    public void init(){
        //TODO
    }

    @Override
    public synchronized void go (Scanner userIn, PrintWriter userOut){
        //TODO
    }

    @Override
    public void stop(){
        //TODO
    }


    @Override
    public void update(Observable o, Object arg) {

    }
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java PlaceClient host port username");
            System.exit(0);
        }
        else{
            ConsoleApplication.launch(PlacePTUI.class, args);
        }
    }
}
