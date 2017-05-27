package org.baade.eel.tools;

import java.util.UUID;

/**
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *         2017/4/1.
 */
public class App {

    public static void main(String[] args) {
        System.out.println(62*62*62);
        System.out.println(UUID.randomUUID());
        System.out.println(UUID.randomUUID());
        System.out.println(UUID.randomUUID());

        System.out.println("--------------------");

        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);


        System.out.println((int)'a');
        System.out.println((int)'A');

        int aiLow = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.print("\"" + (char)aiLow + "\", ");
            aiLow++;
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print("\"" + i + "\", ");
        }

        System.out.println();
        int aiUper = 'A';

        for (int i = 0; i < 26; i++) {
            System.out.print("\"" + (char)aiUper + "\", ");
            aiUper++;
        }

    }
}
