package zad24;


import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import javax.swing.*;
import static java.awt.event.InputEvent.CTRL_DOWN_MASK;

public class TestMenu extends JFrame implements ActionListener {
	private  JTextArea ta = new JTextArea(10,20);
  private JLabel statusBar = new JLabel(" ");
  String[] m1Items = {"Open", "Save", "Save as", "Exit"};
  String[] m21Items = {"Praca", "Szko³a", "Dom"};
  String[] m31Items = { "Blue", "Yellow", "Orange", "Red", "White", "Black", "Green"};
  char mnemo1[]={'O', 'S', 'A', 'X'};
  char mnemo21[]={'P', 'S', 'D'};
  private Icon[] icons = { new IconA(Color.blue), new IconA(Color.yellow), new IconA(Color.orange),  new IconA(Color.red),new IconA(Color.white),new IconA(Color.black),new IconA(Color.green)
	  };
  
  public TestMenu() {
    
    
    //"File", "Adresy","Foreground","Font Size";
    
    // STWORZYC TAB STRINGÓW DO FONTOW 
    String[] m33Items=new String[10];
    int FontS=8;
    //m33Items[0]=
    for(int i=0;i<9;i++){m33Items[i]=""+FontS+" pts"; FontS+=2;}
    
    //MENU 1 "File" 
    JMenu m1 = createMenu("File", m1Items);
   // for(JMenuItem mi : m1Items) m1.add(mi);
   // JPopupMenu popup = new JPopupMenu();
    
    //MENU 2
    JMenu m2 = createMenu("Edit");
    
    JMenu m21 = createMenu("Adresy", m21Items); 
   
   // for(JMenuItem mi : m21Items) m21.add(mi); 
    m2.add(m21);
    
    //MENU 3
    JMenu m3 = createMenu("Options");
    JMenu m31 = createMenu("Foreground", m31Items);
  //  for(JMenuItem mi : m31Items) m31.add(mi); 
    m3.add(m31);
    
    JMenu m32 = createMenu("Background", m31Items);
    //for(JMenuItem mi : m31Items) m32.add(mi); 
    m3.add(m32);
    
    JMenu m33 = createMenu("Font Size", m33Items);
    m3.add(m33);
    
    
    JMenuBar mb = new JMenuBar();
    //mb.setLayout(new BoxLayout(mb, BoxLayout.PAGE_AXIS));
    //mb.setLayout(new GridLayout(0, 3));
    //mb.setLayout(new FlowLayout());
    mb.add(m1);
    mb.add(m2);
    mb.add(m3);
    setJMenuBar(mb);
    
  
   // ta.setComponentPopupMenu(popup);
    add(new JScrollPane(ta));
    
    add(statusBar, "South");
    
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    pack();
    setLocationRelativeTo(null);
    setVisible(true);
  }
  

  private JMenu createMenu(String ktore, String ... txt) {
	    JMenu menu = new JMenu(ktore);
	    
	    if(ktore.equals("File")){
	    //JPanel p=new JPanel();
	   // menu.setLayout(new GridLayout(0, 1));
	    //menu.setLayout(new FlowLayout());
	   // menu.setLayout(new BoxLayout(menu, BoxLayout.PAGE_AXIS));
	    for (int i = 0; i < txt.length; i++) {
	      JMenuItem mi = Menu1Item(txt[i], i);
	    	//JButton mi = new JButton(txt[i]);
	    
	      menu.add(mi);
	    }
	    }
	      else if(ktore.equals("Adresy"))	{
	    	  for (int i = 0; i < txt.length; i++) {
	    	      JMenuItem mi = Menu2Item(txt[i], i);
  	    		   menu.add(mi);
	    	    }
	      }
	      else if(ktore.equals("Foreground")){
	    	  for (int i = 0; i < txt.length; i++) {
	    	      JMenuItem mi = Menu3Item(txt[i], i);
	    	      mi.setActionCommand("m31" + i);
	    	      mi.addActionListener(this);
	    	      menu.add(mi);
	    	    }}
	    	  else if(ktore.equals("Background")){
		    	  for (int i = 0; i < txt.length; i++) {
		    	      JMenuItem mi = Menu3Item(txt[i], i);
		    	      mi.setActionCommand("m32" + i);
		    	      mi.addActionListener(this);
		    	      menu.add(mi);
		    	    }
	      }
	      else {for (int i = 0; i < txt.length; i++) {
		      JMenuItem mi = new JMenuItem(txt[i], i);
		      mi.setActionCommand("m33" + i);
		      mi.addActionListener(this);
		      menu.add(mi);
		    }}
	      //p.add(menu);
	    
	    
	    return menu;
	  }
// Guziki menu 1
  JMenuItem Menu1Item(String t, int k) {
	  JMenuItem mi = new JMenuItem(t);  // element menu z tekstem t 
	  mi.setMnemonic(mnemo1[k]);               // ustalenie mnemoniki
	  
	//  mi.setAccelerator(KeyStroke.getKeyStroke(keys[k])); // ustalenie akceleratora
	  mi.setAccelerator(KeyStroke.getKeyStroke(mnemo1[k], 2)); // 2-java.awt.event.InputEvent.CTRL_MASK (2)
	  mi.setActionCommand("m1" + k); // menu 1 - ActionCommand=10 i w gore?
	  mi.addActionListener(this);
	  return mi;
	}
  //guziki menu 2
  JMenuItem Menu2Item(String t, int k) {
	  JMenuItem mi = new JMenuItem(t);  // element menu z tekstem t 
	  mi.setMnemonic(mnemo21[k]);               // ustalenie mnemoniki
	  
	//  mi.setAccelerator(KeyStroke.getKeyStroke(keys[k])); // ustalenie akceleratora
	  mi.setAccelerator(KeyStroke.getKeyStroke(mnemo21[k], 3)); // java.awt.event.InputEvent.SHIFT_MASK (1) java.awt.event.InputEvent.CTRL_MASK (2) 
	  mi.setActionCommand("m2" + k);
	  mi.addActionListener(this);
	  return mi;
	}
  //menu 3
  JMenuItem Menu3Item(String t, int k) {
	  JMenuItem mi = new JMenuItem(t, icons[k]);  // element menu z tekstem t 
	  
	  return mi;
	}
  
  @Override
  public void actionPerformed(ActionEvent e) {
    //statusBar.setText("Ostatnio wykonano: " + e.getActionCommand());
    String cmd=e.getActionCommand();
    //if(cmd.equals("Open"))openFile();
    /*String[] m1Items = {"Open", "Save", "Save as", "Exit"};
    String[] m21Items = {"Praca", "Szko³a", "Dom"};
    String[] m31Items = { "Blue", "Yellow", "Orange", "Red", "White", "Black", "Green"};*/
    
    	if(cmd.equals("m10"))openFile();
    	else if(cmd.equals("m11"))saveFile();
    	else if(cmd.equals("m12"))saveFile();
    	else if(cmd.equals("m13"))saveFile();
    	else if(cmd.equals("m14"))saveFile();
    
  }
void saveFile(){
    statusBar.setText("Ostatnio wykonano: saveFile()");
}

  void openFile(){
	  statusBar.setText("Otwarto plik");
	  JFileChooser fc = new JFileChooser(new File("."));
	  String approveButt = "Otwórz";
	  int retVal = fc.showDialog(null, approveButt);
      if (retVal == JFileChooser.APPROVE_OPTION)
        System.out.println(approveButt + " " + fc.getSelectedFile());
      File f=fc.getSelectedFile();
     
         String directory = f.getParent();
          String filename = f.getName();
      
      setFile(directory, filename); // Now load and display the file
   // }
      
  }
  
  public void setFile(String directory, String filename) {
	    if ((filename == null) || (filename.length() == 0))
	      return;
	    File f;
	    FileReader in = null;
	    // Read and display the file contents. Since we're reading text, we
	    // use a FileReader instead of a FileInputStream.
	    try {
	      f = new File(directory, filename); // Create a file object
	      in = new FileReader(f); // And a char stream to read it
	      char[] buffer = new char[4096]; // Read 4K characters at a time
	      int len; // How many chars read each time
	      ta.setText(""); // Clear the text area
	      while ((len = in.read(buffer)) != -1) { // Read a batch of chars
	        String s = new String(buffer, 0, len); // Convert to a string
	        ta.append(s); // And display them
	      }
	      this.setTitle("FileViewer: " + filename); // Set the window title
	      ta.setCaretPosition(0); // Go to start of file
	    }
	    // Display messages if something goes wrong
	    catch (IOException e) {
	      ta.setText(e.getClass().getName() + ": " + e.getMessage());
	      this.setTitle("FileViewer: " + filename + ": I/O Exception");
	    }
	    // Always be sure to close the input stream!
	    finally {
	      try {
	        if (in != null)
	          in.close();
	      } catch (IOException e) {
	      }
	    }
	  }




}