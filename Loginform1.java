/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform1;

import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class Loginform1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Database db=new Database();
        db.openConnection();
    }
    
}
