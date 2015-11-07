
package projdata;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BoxLayout;

public class ProjData {
    

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
      finalframe obj=new finalframe();
      obj.setDefaultCloseOperation(2);
      obj.setSize(1100, 500);
      obj.setVisible(true);
     obj.setLayout(new FlowLayout());
      //BoxLayout lay=new BoxLayout(null, 1)
//     Class.forName("org.apache.derby.jdbc.ClientDriver");
//     Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/projdir","pro", "pro");
//     
//java.sql.Statement st =conn.createStatement();
//ResultSet rs=st.executeQuery("select * from PRO.TBLDETAILS ");
//while(rs.next())
//{   if(rs.getString(1).indexOf( 'A' )==0) {
//        System.out.println(rs.getString(1)+"-"+rs.getString(2));
//    }
//
//    
//}
    }
}

    
