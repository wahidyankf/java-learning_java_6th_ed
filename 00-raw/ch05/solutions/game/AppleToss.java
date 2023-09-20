package ch05.solutions.game;

import javax.swing.*;

/**
 * Our apple tossing game. This class extends JFrame to create our
 * main application window. We'll be filling this out along the way, 
 * but for now we can setup a field with some trees and our player.
 */
public class AppleToss extends JFrame {

    Field field = new Field();
    Physicist player1 = new Physicist();

    public AppleToss() {
        // Create our frame
        super("Apple Toss Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,600);
        setResizable(false);

        // Build the field with our player and some trees
        setupFieldForOnePlayer();
    }

    /**
     * A helper method to populate a one player field with target trees.
     */
    private void setupFieldForOnePlayer() {
        // Place our (new) physicist in the lower left corner and connect them to the field
        player1.setPosition(100,500);
        field.setPlayer(player1);
        player1.setField(field);
	field.setupApples();
	field.setupTree();
        field.setupHedge();
	add(field);
    }

    public static void main(String args[]) {
        AppleToss game = new AppleToss();
        game.setVisible(true);
    }
}
