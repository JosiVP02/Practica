/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.Vista.FRM_Menu;

/**
 *
 * @author Usuario
 */
public class ManejadorMenu implements ActionListener
{
    private FRM_Menu menu;
    
      public ManejadorMenu()
      {
      this.menu=new FRM_Menu();
      this.menu.escuchar(this);
      this.menu.setVisible(true);
      
      }
      
      
      
      public void actionPerformed(ActionEvent e) 
    {
        switch(e.getActionCommand().toString())
        {
            case "Clientes":
                
               
                break;
                
            case "Factura":
                
                
                break;
                
            case "Salir":
                
              System.exit(0);
                break;
                
                
            case "Reportes":
                
                
                
                break;
                    
        
        }
    }

}
