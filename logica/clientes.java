
package logica;

public class clientes 
{
    private String NombreClntBuscar;
    private String CodigoClnt;
    private String NombreClnt;
    private int EdadClnt;
    private String DireccionClnt;
    private String CodigoClntCita;

    public String getNombreClntBuscar() {
        return NombreClntBuscar;
    }

    public void setNombreClntBuscar(String NombreClntBuscar) {
        this.NombreClntBuscar = NombreClntBuscar;
    }

    public String getCodigoClnt() {
        return CodigoClnt;
    }

    public void setCodigoClnt(String CodigoClnt) {
        this.CodigoClnt = CodigoClnt;
    }

    public String getNombreClnt() {
        return NombreClnt;
    }

    public void setNombreClnt(String NombreClnt) {
        this.NombreClnt = NombreClnt;
    }

    public int getEdadClnt() {
        return EdadClnt;
    }

    public void setEdadClnt(int EdadClnt) {
        this.EdadClnt = EdadClnt;
    }

    public String getDireccionClnt() {
        return DireccionClnt;
    }

    public void setDireccionClnt(String DireccionClnt) {
        this.DireccionClnt = DireccionClnt;
    }

    public String getCodigoClntCita() {
        return CodigoClntCita;
    }

    public void setCodigoClntCita(String CodigoClntCita) {
        this.CodigoClntCita = CodigoClntCita;
    }
    
public String mostrar_info()
    {
        String info = "Codigo: " + getCodigoClnt() + "\n" +
                      "Nombre: " + getNombreClnt() + "\n" +
                      "Edad: " + getEdadClnt() + "\n" +
                      "Direccion: " + getDireccionClnt() + "\n"; 
        return info;
    }
    
}   
 
