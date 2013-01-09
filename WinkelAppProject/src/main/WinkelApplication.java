package main;

import connectivity.Dbmanager;
import connectivity.QueryManager;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

// hele nieuwe testregel
// alweer een testregel
// demonstratie
public final class WinkelApplication {
    /** Define frame width, height and name*/
    public static final int FRAME_WIDTH = 755;
    public static final int FRAME_HEIGHT = 480;
    public static final String NAME = "WinkelApplicatie";
    public static final String CURRENCY = "\u20AC";
    /** static fonts which are used within the application */
    public static final Font FONT_10_PLAIN = new Font("Verdana", Font.PLAIN, 10);
    public static final Font FONT_10_BOLD = new Font("Verdana", Font.BOLD, 10);
    public static final Font FONT_12_BOLD = new Font("Verdana", Font.BOLD, 12);
    public static final Font FONT_16_BOLD = new Font("Verdana", Font.BOLD, 16);
    /** database manager */
    private Dbmanager dbManager;
    private QueryManager queryManager;
    /** models used in the application */
    private model.Basket basket;
    /** the main window */
    private JFrame mainWindow;
    
    private model.Klant klant;
    
    /** singleton of the application */
    private static WinkelApplication instance = new WinkelApplication();

    private WinkelApplication() {
    }

    public void initialize() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println("Error setting LookAndFeelClassName: " + e);
        }
        // create and initialize the connectivity
        dbManager = new Dbmanager();
        dbManager.openConnection();
        queryManager = new QueryManager(dbManager);

        // create an empty basket
        basket = new model.Basket();
        
        //testen van addnewProduct
        //queryManager.addNewProduct(37,3,"Eerste nieuwe product",13.37,"Het allereerste product dat succesvol is toegevoegd");
        
        //testen van deleteProduct
        //queryManager.deleteProduct(37);
        
        //testen van modifyProduct
        //queryManager.modifyProduct(37, 2, "Eerste gewijzigd product", 37.37, "FFFFFFFFUCK YEAH HET WERKT!");
        
        //testen van addNewKlant
        //queryManager.addNewKlant(3,"Jan Timmerman","Pizzastraat 37", "1010HH", "Atlantis");
        
        //testen van deleteKlant
        //queryManager.deleteKlant(3);
        
        //testen van modifyKlant
        //queryManager.modifyKlant(3, "Jan Gewijzigd", "successtraat", "6666LP", "San Andreas");
    }

    public void startup() {
        klant = queryManager.getKlant(1);  //haalt klant op met ID 1
        mainWindow = new JFrame(NAME);
        mainWindow.setSize(FRAME_WIDTH, FRAME_HEIGHT);

        /** Make the window closing [x] button on the frame active */
        mainWindow.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent event) {
                shutdown();
            }
        });

        mainWindow.getContentPane().setLayout(new BorderLayout());
          showPanel(new view.CategoryList());  //laat als eerste de categorylist zien als je programma opstart
          //showPanel(new productDelete.ProductDeleteAsk());
          //showPanel(new view.ProductAdd());
          //showPanel(new productModify.ProductModifyAsk());
          showPanel(new view.MedewerkerPanel());
        mainWindow.setVisible(true);
    }

    public void showPanel(javax.swing.JPanel panel) {
        mainWindow.getContentPane().removeAll();
        mainWindow.getContentPane().add(panel, BorderLayout.CENTER);
        mainWindow.getContentPane().validate();
        mainWindow.getContentPane().repaint();
    }

    public void exit() {
        mainWindow.setVisible(false);
        shutdown();
    }

    private void shutdown() {
        mainWindow.dispose();
        dbManager.closeConnection();
    }

    /**
     * @return the instance of this class
     */
    public static WinkelApplication getInstance() {  
        return instance;   // instance is winkelapplication object
    }

    /**
     * @return the queryManager
     */
    public static QueryManager getQueryManager() {
        return getInstance().queryManager;  //returnt het queryManager object uit de winkelapplicatie instance
    }

    /**
     * @return the basket
     */
    public static model.Basket getBasket() {
        return getInstance().basket;
    }

    public static model.Klant getKlant(){
        return getInstance().klant;
    }
    
    public static void main(String args[]) {
        final WinkelApplication applicatie = WinkelApplication.getInstance();
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {   //wordt automatisch opgestart? (special method?)
                try {
                    applicatie.initialize(); //opent database
                    applicatie.startup();  //haalt klant met ID 1 op, en laat categorie list zien
                } catch (Exception e) {
                    System.out.println("Application" + applicatie.getClass().getName() + "failed to launch");
                }
            }
        });
    }
}
