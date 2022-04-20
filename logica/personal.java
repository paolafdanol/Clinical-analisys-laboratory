package logica;

public class personal {
    private String CodigoEmpBuscar;
    private String CodigoEmp;
    private String NombreEmp;
    private int EdadEmp;
    private String TipoEmp;
    private String RFCEmp;
    private int SalarioEmp;

    public String getCodigoEmpBuscar() {
        return CodigoEmpBuscar;
    }

    public void setCodigoEmpBuscar(String CodigoEmpBuscar) {
        this.CodigoEmpBuscar = CodigoEmpBuscar;
    }

    public String getCodigoEmp() {
        return CodigoEmp;
    }

    public void setCodigoEmp(String CodigoEmp) {
        this.CodigoEmp = CodigoEmp;
    }

    public String getNombreEmp() {
        return NombreEmp;
    }

    public void setNombreEmp(String NombreEmp) {
        this.NombreEmp = NombreEmp;
    }

    public int getEdadEmp() {
        return EdadEmp;
    }

    public void setEdadEmp(int EdadEmp) {
        this.EdadEmp = EdadEmp;
    }

    public String getTipoEmp() {
        return TipoEmp;
    }

    public void setTipoEmp(String TipoEmp) {
        this.TipoEmp = TipoEmp;
    }

    
    
    public String getRFCEmp() {
        return RFCEmp;
    }

    public void setRFCEmp(String RFCEmp) {
        this.RFCEmp = RFCEmp;
    }

    public int getSalarioEmp() {
        return SalarioEmp;
    }

    public void setSalarioEmp(int SalarioEmp) {
        this.SalarioEmp = SalarioEmp;
    }
    
 public String mostrar_info()
 {
     String info = "Codigo: " + getCodigoEmp() + "\n" +
                   "Nombre: " + getNombreEmp() + "\n" +
                   "Edad: " + getEdadEmp() + "\n" +
                   "RFC: " + getTipoEmp() + "\n" +
                   "Tipo: " + getRFCEmp() + "\n" +
                   "Salario: " + getSalarioEmp() + "\n";
     return info;
}
    
}
