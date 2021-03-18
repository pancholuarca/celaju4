package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vistas.ventanaGerente;
import vistas.ventanaVendedor;
import vistas.ventanaPrincipal;

public class conexion {
    public static Connection con;
      
    
    public void conectar(){ 
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testcelaju","root","root1234");
            if (con!=null){
            System.out.println("Conectado a la base de datos");
            }
        } catch (SQLException e) {
            System.out.println("Sin Conexion a base de datos");
        }
    }
    
    public void desconectar() throws SQLException{
        con.close();
        System.out.println("Desconectado de la base de Datos");
    }
    
    
    public void iniciosesion(String usuario, String contraseña) throws SQLException{
        PreparedStatement ps = con.prepareStatement("select * from usuario where Nombre =? and Contraseña=?");
        ps.setString(1,usuario);
        ps.setString(2,contraseña);
        ResultSet rs = ps.executeQuery();
        if(rs.next()==true){
           JOptionPane.showMessageDialog(null,"Bienvenido") ;
           System.out.println("el usuario es "+rs.getString(2));
           if("1".equals(rs.getString(4))){
                System.out.println("usuario es gerente");
                ventanaGerente gerente = new ventanaGerente();
                gerente.setVisible(true);
            }
            if("2".equals(rs.getString(4))){
                System.out.println("usuario es vendedor");
                ventanaVendedor vendedor = new ventanaVendedor();
                vendedor.setVisible(true);
            }
         }else{
            JOptionPane.showMessageDialog(null,"Datos Incorrectos") ;
        }
    }
    
    public void agregarcliente(String Nombre, String Nit, String Telefono, String Direccion, String Tipo) throws SQLException{
        PreparedStatement ps = con.prepareStatement("INSERT INTO cliente(Nombre, Nit, Telefono, Direccion, Tipo) VALUES(?,?,?,?,?)");
        ps.setString(1, Nombre);
        ps.setString(2, Nit);
        ps.setString(3, Telefono);
        ps.setString(4, Direccion);
        ps.setString(5, Tipo);
        ps.executeUpdate();
        System.out.println("cliente agregado");        
    }
    
    
    
    
    
}
