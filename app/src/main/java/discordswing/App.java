/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package discordswing;

import javax.swing.SwingUtilities;

//my class import
import discordswing.guiskeleton.FourColumnLayout;

public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

			public void run() {
                new FourColumnLayout();
            }
        });
    }
}
