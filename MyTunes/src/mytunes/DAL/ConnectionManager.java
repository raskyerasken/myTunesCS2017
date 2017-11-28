/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.DAL;

<<<<<<< HEAD
=======
<<<<<<< HEAD
import java.sql.Connection;
//import com.microsoft.sqlserver.mytunes.SQLServerDataSource;
//import com.microsoft.sqlserver.mytunes.SQLServerException;


=======
<<<<<<< HEAD
>>>>>>> 2d3dc6f7b321e8606aedb385c6d3cc0581a44b50
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;

/**
 *
 * @author kasper
 */
public class ConnectionManager {
    private SQLServerDataSource ds = new SQLServerDataSource();
    public ConnectionManager() {
        ds.setDatabaseName("CS2017A_39_PRISON");
        ds.setUser("CS2017A_39_java");
        ds.setPassword("javajava");
        ds.setPortNumber(1433);
        ds.setServerName("10.176.111.31");
    }
    
    public Connection getConnection() throws SQLServerException
    {
        return ds.getConnection();
    }
<<<<<<< HEAD
=======
=======
>>>>>>> 23e6a653d6fb81595d7926982c0c07d7a1324c9b
/**
 *
 * @author mr.Andersen
 */
<<<<<<< HEAD
public class ConnectionManager 
{
   /* private SQLServerDataSource ds = new SQLServerDataSource();
    public ConnectionManager() 
    {
        ds.setDatabaseName("CS2017B_17_bestTunes");
        ds.setUser("CS2017A_17_java");
        ds.setPassword("javajava");
        ds.setPortNumber(1433);
        ds.setServerName("10.176.111.31");
    }
    
    public Connection getConnection() throws SQLServerException
    {
        return ds.getConnection();
    }*/
=======
public class ConnectionManager {
>>>>>>> 6be0ddcd6ead80a6c93ccfdce69144edf23b446c
>>>>>>> 23e6a653d6fb81595d7926982c0c07d7a1324c9b
>>>>>>> 2d3dc6f7b321e8606aedb385c6d3cc0581a44b50
    
}
