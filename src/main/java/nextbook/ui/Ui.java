package nextbook.ui;

import nextbook.domain.ClueService;
import nextbook.domain.Clue;
import nextbook.domain.Book;

import java.util.Scanner;
import java.util.ArrayList;
import nextbook.io.IO;

public class Ui {
    
    private IO io;
    //private Scanner sc;
    private ClueService clueService;

    public Ui(IO io, ClueService clueService) {
        this.io = io;
        this.clueService = clueService;
    }

    public void start() {
        io.print("Give 'add' to add book");
        io.print("Give 'list' to list books");
        io.print("Give empty line to exit program");

        while (true) {
            io.print("");
            String command = io.nextLine();
            if (command.isEmpty()) {
                break;
            }

            if (command.equals("add")) {
                String name = io.readLine("Give name of the book");
                //io.print("Give name of the book");
                //String name = sc.nextLine();
                String author = io.readLine("Give author of the book");
                //io.print("Give author of the book");
                //String author = sc.nextLine();
                Clue book = new Book(name, author);
                clueService.createClue(book);
                io.print("New book added");
                //System.out.println("New book added");
            }

            if (command.equals("list")) {
                ArrayList<Clue> clues = clueService.readClues();
                for (Clue c: clues) {
                    io.print(c);
                    //System.out.println(c);
                }
            }

        }
    }

}

