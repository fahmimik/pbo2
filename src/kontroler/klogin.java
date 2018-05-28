package kontroler;

import model.loginlor;
import penyilihan.loginx;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import penyilihan.pinjem;
import penyilihan.tux;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author X
 */
public class klogin {

    loginlor theModel;
    loginx theView;

    public klogin(loginlor model, loginx view) {
        theModel = model;
        theView = view;
//        theView.loginListener(new logineListener());
    }

    private class logineListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                System.out.println("test");
                theModel.logincek(theView.getUsername(), theView.getPassword());
                switch (theModel.getStatus()) {
                    case "1":
                    theView.dispose();
                    tux x  = new tux();
                    x.setVisible(true);
                        break;
                    
                    case "2" :
                        theView.dispose();
                    pinjem y = new pinjem();
                    y.setVisible(true);
                        break;
                        
                    default :
                        JOptionPane.showMessageDialog(theView, "salah lorr");

                }
            } catch (SQLException ex) {
                Logger.getLogger(klogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
