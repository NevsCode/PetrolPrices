
package question2019;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PetrolPrices implements ActionListener {
    
    JFrame frame;
    JMenuBar MenuBar;
    JMenu file ,tools;
    JMenuItem eixt,submit,report;
    JLabel city ,year;
    JComboBox selectcity,selectyear;
    JButton submitButton;
    
    PetrolPrices()
    {
        
        submitButton = new JButton("SUBMIT");
        submitButton.setBounds(100, 300, 120, 30);
        submitButton.setFocusable(false);
        submitButton.addActionListener(this);
        
        String[] cityName = {"Johannesburg","Durban","Cape Town "};
        selectcity = new JComboBox(cityName);
        selectcity.setBounds(100, 100, 120, 50);
        selectcity.setFocusable(false);
        
        String[] cityear = {"2017","2018","2019"};
        selectyear = new JComboBox(cityear);
        selectyear.setBounds(100, 200, 120, 50);
        selectyear.setFocusable(false);
        
        city = new JLabel();
        city.setText("City:");
        city.setBounds(50, 100, 100, 50);
        
        year = new JLabel();
        year.setText("Year:");
        year.setBounds(50, 200, 100, 50);
        
        
        eixt = new  JMenuItem("Eixt");
        
        submit = new JMenuItem("Submit");
        
        report = new  JMenuItem("Report");
        
        file = new JMenu("File");
        file.setBounds(10, 0,60, 50);
        file.setFocusable(false);
        eixt.addActionListener(this);
        file.add(eixt);
        
        tools = new JMenu("Tools");
        tools.setBounds(10, 0,60, 50);
        tools.setFocusable(false);
        tools.add(submit);
        
        submit.addActionListener(this);
        tools.add(report);
        report.addActionListener(this);
        
        MenuBar = new JMenuBar();
        MenuBar.add(file);
        MenuBar.add(tools);
        
        frame = new JFrame();
        frame.setSize(400, 500);
        frame.setTitle("Petrol Application");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setJMenuBar(MenuBar);
        frame.add(MenuBar);
        frame.add(city);
        frame.add(year);
        frame.add(selectcity);
        frame.add(selectyear);
        frame.add(submitButton);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == submitButton )
        {
            String chooseyear = selectyear.getSelectedItem().toString();
            String[] cityName = {"Johannesburg","Durban","Cape Town "};
            String name = selectcity.getSelectedItem().toString();
            String[] cityear = {"2017","2018","2019"};
            double[][] CityspetrolPrice = {{10.72,12.75,13.70},{10.35,12.32,13.31},{10.20,12.22,13.23}};
            
            boolean flag = false;
            for(int i = 0; i < cityear.length;i++ )
            {
                for(int y = 0; y < CityspetrolPrice.length;y++)
                {
                    if((cityear[i].equals(chooseyear)) && (cityName[y].equals(name)) )
                    {
                        flag = true;
                    
                        JOptionPane.showMessageDialog(null,"CITY: " +  name + "\nYEAR: " 
                        +  chooseyear + "\nCOST: " + "R " + CityspetrolPrice[i][y],"Petrol Costs",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                
            }
        }
        if(e.getSource() == submit)
        {
            String chooseyear = selectyear.getSelectedItem().toString();
            String[] cityName = {"Johannesburg","Durban","Cape Town "};
            String name = selectcity.getSelectedItem().toString();
            String[] cityear = {"2017","2018","2019"};
            double[][] CityspetrolPrice = {{10.72,12.75,13.70},{10.35,12.32,13.31},{10.20,12.22,13.23}};
            
            boolean flag = false;
            for(int i = 0; i < cityear.length;i++ )
            {
                for(int y = 0; y < CityspetrolPrice.length;y++)
                {
                    if((cityear[i].equals(chooseyear)) && (cityName[y].equals(name)) )
                    {
                        flag = true;
                    
                        JOptionPane.showMessageDialog(null,"CITY: " +  name + "\nYEAR: " 
                        +  chooseyear + "\nCOST: " + "R " + CityspetrolPrice[i][y],"Petrol Costs",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                
            }
            
        }
        
        if(e.getSource() == eixt)
        {
          System.exit(0);
        }
        
        if(e.getSource() ==  report)
        {
            double[][] CityspetrolPrice = {{10.72,10.35,10.20},{12.75,12.32,12.22},{13.70,13.31,13.23}};
            double average_JHB;
            double average_DBN;
            double average_CP;
            double total;
            double total_DBN;
            double total_CP;
            total = CityspetrolPrice[0][0] +  CityspetrolPrice[0][1] +  CityspetrolPrice[0][2] ;
            average_JHB = total/3;
            
            total_DBN = CityspetrolPrice[1][0] +  CityspetrolPrice[1][1] +  CityspetrolPrice[1][2] ;
            average_DBN = total_DBN/3;
            
            total_CP = CityspetrolPrice[2][0] +  CityspetrolPrice[2][1] +  CityspetrolPrice[2][2] ;
            average_CP = total_CP/3;
            JOptionPane.showMessageDialog(null, "Average Petrol Costs for Johannesburg is R " 
            + Math.round(average_JHB * 100.0)/100 + "\nAverage Petrol Costs for Durban is R" + average_DBN 
            + "\nAverage Petrol Costs for Cape Town is R" + Math.round(average_CP * 100.0)/100,"Message",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
