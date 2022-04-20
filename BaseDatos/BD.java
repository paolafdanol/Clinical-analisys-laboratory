
package BaseDatos;

import java.sql.*;
import java.util.Vector;
import logica.recursos;
import logica.personal;
import logica.clientes;
import logica.citas;

public class BD {
    Connection conexion;
    
  PreparedStatement stInsertarProd;
  PreparedStatement stInsertarEmp;
  PreparedStatement stInsertarClnt;
  PreparedStatement stBuscarProd;
  PreparedStatement stBuscarEmp;
  PreparedStatement stBuscarClnt;
  PreparedStatement stCambiarProd;
  PreparedStatement stEliminarEmp;
  PreparedStatement stEliminarClnt;
  PreparedStatement stMostrarProd;
  PreparedStatement stModificarEmp;
  PreparedStatement stModificarClnt;
  PreparedStatement stInsertarCita;
  
  public BD() {
     try{
          Class.forName("com.mysql.cj.jdbc.Driver");
      }catch(ClassNotFoundException ex){
          System.out.println("Error al cargar el controlador");
          System.out.println(ex.getMessage());  
      }
  }
  
  public void abrir() { 
      try {
        conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/laboratorio?serverTimezone=GMT-5", "root", "");
         stInsertarProd = conexion.prepareStatement("INSERT INTO recursos VALUES(?,?,?,?,?)");
        stInsertarEmp = conexion.prepareStatement("INSERT INTO personal VALUES(?,?,?,?,?,?)");
       stInsertarClnt = conexion.prepareStatement("INSERT INTO clientes VALUES(?,?,?,?)");
         stBuscarProd = conexion.prepareStatement("SELECT * FROM recursos WHERE Nombre=?");
        stBuscarEmp = conexion.prepareStatement("SELECT * FROM personal WHERE Codigo=?");
      stBuscarClnt = conexion.prepareStatement("SELECT * FROM clientes WHERE Nombre=?");
         stCambiarProd = conexion.prepareStatement("UPDATE recursos set Precio=? WHERE Nombre=?");
        stModificarEmp = conexion.prepareStatement("UPDATE personal set Nombre=?, Edad=?, Tipo=?, RFC=?,Salario=? WHERE Codigo=?");
      stModificarClnt= conexion.prepareStatement("UPDATE clientes set Nombre=?, Edad=?, Direccion=? WHERE Codigo=?");
        stEliminarEmp = conexion.prepareStatement("DELETE FROM personal WHERE Codigo=?");
      stEliminarClnt = conexion.prepareStatement("DELETE FROM clientes WHERE Codigo=?");
         stMostrarProd = conexion.prepareStatement("SELECT * FROM recursos");
         stInsertarCita = conexion.prepareStatement("INSERT INTO citas VALUES(?,?,?,?,?)");
      }catch(SQLException ex) {
          System.out.println("Error al Obtener la conexión");
          System.out.println(ex.getMessage());
      }
  }
  
   public void cerrar() {
      try {
        conexion.close();
      }catch(SQLException ex) {
          System.out.println("Error al cerrar la conexión");
          System.out.println(ex.getMessage());
      }
  }
  
public void insertarProducto(recursos objRec){
      try {
        stInsertarProd.setString(1, objRec.getNombreProd());
        stInsertarProd.setString(2, objRec.getCodigoProd());
        stInsertarProd.setString(3, objRec.getTipoProd());
        stInsertarProd.setInt(4, objRec.getExistenciaProd());
        stInsertarProd.setInt(5, objRec.getPrecioProd());
       
        stInsertarProd.executeUpdate();
      }catch(SQLException ex){
          System.out.println("Error al insertar un producto");
          System.out.println(ex.getMessage());
      }
  }   

public recursos buscarProducto(String NombreProd) {
     recursos objRec = null;
     ResultSet rs=null;
     try{
        stBuscarProd.setString(1, NombreProd);
        rs=stBuscarProd.executeQuery(); 
        if(rs.next()){
            objRec = new recursos();
            objRec.setNombreProd(rs.getString("Nombre"));
            objRec.setCodigoProd(rs.getString("Codigo"));
            objRec.setTipoProd(rs.getString("Tipo"));
            objRec.setExistenciaProd(rs.getInt("Existencia"));
            objRec.setPrecioProd(rs.getInt("Precio")); 
       
        }
     }catch(SQLException ex){
         System.out.println("Error al obtener el resultado de busqueda");
         System.out.println(ex.getMessage());
     }
     return objRec; 
  } 

 public void actualizarPrecio(recursos objRec){
      try{
        
        stCambiarProd.setString(2, objRec.getCodigoProd());
        stCambiarProd.setInt(1, objRec.getPrecioProdMod());
        stCambiarProd.executeUpdate();
        
      }catch(SQLException ex) {
          System.out.println("Error al Actualizar un Precio");
          System.out.println(ex.getMessage());
      }
  }

public Vector buscarProducto1(String Nombre) {
     int cout=0;
     recursos objRec = null;
     Vector arraRec= new Vector();
     ResultSet rs=null;
     try{
        rs=stMostrarProd.executeQuery(); 
        while(rs.next()){
            objRec = new recursos();
            objRec.setNombreProd(rs.getString("Nombre"));
            objRec.setCodigoProd(rs.getString("Codigo"));
            objRec.setTipoProd(rs.getString("Tipo"));
            objRec.setExistenciaProd(rs.getInt("Existencia"));
            objRec.setPrecioProd(rs.getInt("Precio")); 
            arraRec.add(objRec);
        }
     }catch(SQLException ex){
         System.out.println("Error al obtener el resultado de busqueda");
         System.out.println(ex.getMessage());
     }
     return arraRec; 
  } 
 
 public void insertarPersonal(personal objPers){
      try {
        stInsertarEmp.setString(1, objPers.getCodigoEmp());
        stInsertarEmp.setString(2, objPers.getNombreEmp());
        stInsertarEmp.setInt(3, objPers.getEdadEmp());
        stInsertarEmp.setString(4, objPers.getTipoEmp());
        stInsertarEmp.setString(5, objPers.getRFCEmp());
        stInsertarEmp.setInt(6, objPers.getSalarioEmp());
        
        stInsertarEmp.executeUpdate();
      }catch(SQLException ex){
          System.out.println("Error al agregar");
          System.out.println(ex.getMessage());
      }
  }
 
 public personal buscarEmpleado(String NombreEmp) {
     personal objPers = null;
     ResultSet rs1=null;
     try{
        stBuscarEmp.setString(1, NombreEmp);
        rs1=stBuscarEmp.executeQuery(); 
        if(rs1.next()){
            objPers = new personal();
            objPers.setCodigoEmp(rs1.getString("Codigo"));
            objPers.setNombreEmp(rs1.getString("Nombre"));
            objPers.setEdadEmp(rs1.getInt("Edad"));
            objPers.setTipoEmp(rs1.getString("Tipo"));
            objPers.setRFCEmp(rs1.getString("RFC"));
            objPers.setSalarioEmp(rs1.getInt("Salario")); 
        }
     }catch(SQLException ex){
         System.out.println("Error al obtener el resultado de busqueda");
         System.out.println(ex.getMessage());
     }
     return objPers; 
  }
 
 public void actualizarEmp(personal objPers){
      try{
        stModificarEmp.setString(1, objPers.getCodigoEmp());
        stModificarEmp.setString(2, objPers.getNombreEmp());
        stModificarEmp.setInt(3, objPers.getEdadEmp());
        stModificarEmp.setString(4, objPers.getTipoEmp());
        stModificarEmp.setString(5, objPers.getRFCEmp());
        stModificarEmp.setInt(6, objPers.getSalarioEmp());
        stModificarEmp.executeUpdate();
        
      }catch(SQLException ex) {
          System.out.println("Error al Actualizar un empleado");
          System.out.println(ex.getMessage());
      }
  }
 
 public void eliminarEmp(personal objPers){
      
      try{
        stEliminarEmp.setString(1, objPers.getCodigoEmp());
        stEliminarEmp.executeUpdate();
        
      }catch(SQLException ex){
          System.out.println("Error al eliminar un empleado");
          System.out.println(ex.getMessage());
      }
  }
 
public void insertarClnt(clientes objClnt){
      try {
        stInsertarClnt.setString(1, objClnt.getCodigoClnt());
        stInsertarClnt.setString(2, objClnt.getNombreClnt());
        stInsertarClnt.setInt(3, objClnt.getEdadClnt());
        stInsertarClnt.setString(4, objClnt.getDireccionClnt());
        
       
        stInsertarClnt.executeUpdate();
      }catch(SQLException ex){
          System.out.println("Error al insertar un cliente");
          System.out.println(ex.getMessage());
      }
  }
 
public clientes buscarCliente(String NombreClnt) {
     clientes objClnt= null;
     ResultSet rs2= null;
     try{
        stBuscarClnt.setString(1, NombreClnt);
        rs2=stBuscarClnt.executeQuery(); 
        if(rs2.next()){
            objClnt = new clientes();
            objClnt.setNombreClnt(rs2.getString("Nombre"));
            objClnt.setEdadClnt(rs2.getInt("Edad"));
            objClnt.setDireccionClnt(rs2.getString("Domicilio"));
            objClnt.setCodigoClnt(rs2.getString("Codigo"));
        }
     }catch(SQLException ex){
         System.out.println("Error al obtener el resultado de busqueda");
         System.out.println(ex.getMessage());
     }
     return objClnt; 
  } 

public void actualizarCliente(clientes objClnt){
      try{
        stModificarClnt.setString(1, objClnt.getNombreClnt());
        stModificarClnt.setInt(2, objClnt.getEdadClnt());
        stModificarClnt.setString(3, objClnt.getDireccionClnt());
        stModificarClnt.setString(4, objClnt.getCodigoClnt());
        
        stModificarClnt.executeUpdate();
        
      }catch(SQLException ex) {
          System.out.println("Error al Actualizar un cliente");
          System.out.println(ex.getMessage());
      }
  }

public void eliminarCliente(clientes objClnt){
      
      try{
        stEliminarClnt.setString(1, objClnt.getCodigoClnt());
        stEliminarClnt.executeUpdate();
        
      }catch(SQLException ex){
          System.out.println("Error al eliminar un cliente");
          System.out.println(ex.getMessage());
      }
  }

public void insertarCita(citas objCita){
      try {
        stInsertarCita.setString(1, objCita.getCodigoClntCita());
        stInsertarCita.setString(2, objCita.getTipoEstudio());
        stInsertarCita.setString(3, objCita.getDiaCita());
        stInsertarCita.setString(4, objCita.getMesCita());
        stInsertarCita.setString(5, objCita.getHoraCita());
       
        stInsertarProd.executeUpdate();
      }catch(SQLException ex){
          System.out.println("Error al insertar un producto");
          System.out.println(ex.getMessage());
      }
  }

}
