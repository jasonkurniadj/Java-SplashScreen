package splashscreen;

/**
 *
 * @author Jason.
 */
public class Splashscreen {
    public Splashscreen(){
        Screen screen = new Screen();
        screen.setVisible(true);
        
        try {
            for(int i=0; i<=100; i++){
                Thread.sleep(100);
                
                screen.loadNum.setText(Integer.toString(i) + " %");
                screen.loadBar.setValue(i);
            }
            
            Welcome welcome = new Welcome();
            screen.setVisible(false);
            welcome.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new Splashscreen();
    }
}
