package nextbook;

import nextbook.ui.Ui;
import nextbook.domain.ClueService;
import nextbook.dao.ClueDao;
import java.util.Scanner;
import nextbook.dao.SqlClueDao;
import nextbook.io.ConsoleIO;
import nextbook.io.IO;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClueDao dao = new SqlClueDao();
        IO io = new ConsoleIO();
        ClueService clueService = new ClueService(dao);

        //Ui commandlineUi = new Ui(sc, clueService);
        Ui commandlineUi = new Ui(io, clueService);
        commandlineUi.start();
    }

}

