import java.io.IOException;

public class CharArrayProcessing {
    public static void main(String[] args) throws IOException {
        int c, counter = 0;
        char[] puffer = new char[128];
        System.out.println("Geben Sie eine Zeichenkette ein: ");
        while (true) {
            c = System.in.read();
            if (c == '\r' || c == '\n') {
                break;
            }
            puffer[counter] = (char) c;
            counter++;
        }

        char[] muster = new char[counter];
        for (int i = 0; i < muster.length; i++) {
            muster[i] = puffer[i];
        }

        int aufgabe = 3;
        switch (aufgabe) {
            case 1:
                int buchst1, buchst2;

                System.out.println("Geben Sie einen Buchstaben ein der ersetzt werden soll, und durch was er ersetzt werden soll: ");
                buchst1 = System.in.read();
                System.in.read();
                buchst2 = System.in.read();
                System.in.read();

                char[] ag = new char[muster.length];
                for (int i = 0; i < muster.length; i++) {
                    if (muster[i] == buchst1) {
                        ag[i] = (char) buchst2;
                    } else {
                        ag[i] = muster[i];
                    }
                    System.out.print(ag[i]);
                }
                break;

            case 2:
                System.out.println();
                char[] ag2 = new char[muster.length - 1];
                System.out.println("Geben Sie die zu ersetzende Stelle ein: ");
                int raus = System.in.read();
                if ('0' <= raus && raus <= '9') {
                    raus = raus - '0';
                } else {
                    System.out.println("Ungültige Eingabe. ");
                    return;
                }
                for (int i = 0; i < muster.length - 1; i++) {
                    if (i < raus) {
                        ag2[i] = muster[i];
                    } else if (i >= raus) {
                        ag2[i] = muster[i + 1];
                    }
                    System.out.print(ag2[i]);
                }
                System.out.println();
                System.out.println("Gelöschtes Zeichen: " + muster[raus]);
                break;

            case 3:
                System.out.println("Geben Sie das zu entfernende Zeichen ein: ");
                //System.in.read();
                int entf = System.in.read();
                int counter1 = 0;
                int anzahl = 0;
                for (int i = 0; i < muster.length; i++) {
                    if (muster[i] == entf) {
                        anzahl++;
                    }
                }

                char[] ag3 = new char[muster.length - anzahl];
                for (int i = 0; i < muster.length - anzahl; i++) {
                    ag3[i] = muster[i + counter1];
                    while (ag3[i] == entf) {
                        counter1++;
                        ag3[i] = muster[i + counter1];
                    }
                    System.out.print(ag3[i]);
                }
                break;

            case 4:
                char[] ag4 = new char[muster.length + 1];
                System.out.println("Geben Sie die Stelle ein an die ein - eingefügt werden soll: ");
                System.in.read();
                int bindestr = System.in.read();
                if ('1' <= bindestr && bindestr <= '9') {
                    bindestr = bindestr - '0' - 1;
                } else {
                    System.out.println("Ungültige Eingabe.");
                    return;
                }
                for (int i = 0; i < muster.length + 1; i++) {
                    if (i < bindestr) {
                        ag4[i] = muster[i];
                    } else if (i == bindestr) {
                        ag4[i] = '-';
                    } else {
                        ag4[i] = muster[i - 1];
                    }
                    System.out.print(ag4[i]);
                }
                break;

            case 5:
                counter = 0;
                System.out.println("Geben Sie eine Zeichenkette ein: ");
                while (true) {
                    c = System.in.read();
                    if (c == '\r' || c == '\n') {
                        break;
                    }
                    puffer[counter] = (char) c;
                    counter++;
                }

                char[] muster2 = new char[counter];
                for (int i = 0; i < muster2.length; i++) {
                    muster2[i] = puffer[i];
                }




        }
    }
}
