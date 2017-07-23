import java.io.*;
import java.util.Scanner;

public class Minis {

    public void write(File file, String s) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(s);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException io) {
        }
    }

    public String read(File file) {
        String s = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String t;
            while ((t = bufferedReader.readLine()) != null)
                s += t + "\n";
        } catch (IOException io) {
        }
        return s;
    }

    public String formatDate(String date, String delimiter) {

        Scanner scanner = new Scanner(date);
        scanner.useDelimiter(delimiter);

        String s = scanner.next();

        switch (scanner.nextInt()) {
            case 1:
                s += "-JAN";
                break;
            case 2:
                s += "-FEB";
                break;
            case 3:
                s += "-MAR";
                break;
            case 4:
                s += "-APR";
                break;
            case 5:
                s += "-MAY";
                break;
            case 6:
                s += "-JUN";
                break;
            case 7:
                s += "-JUL";
                break;
            case 8:
                s += "-AUG";
                break;
            case 9:
                s += "-SEP";
                break;
            case 10:
                s += "-OCT";
                break;
            case 11:
                s += "-NOV";
                break;
            case 12:
                s += "-DEC";
                break;
        }

        s += "-" + scanner.next();

        return s;

    }

    public String formatTime(String time, String delimiter) {

        int t, u;
        Scanner scanner = new Scanner(time);
        scanner.useDelimiter(delimiter);

        return (t = scanner.nextInt()) % 12 + ":" + (((u = scanner.nextInt()) % 100 == 0) ? "0" + u : u + "") + ((t > 12) ? " PM" : " AM");

    }

}
