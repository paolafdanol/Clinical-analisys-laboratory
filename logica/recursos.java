
package logica;


public class recursos
{
    //Atributos de los recursos
    private String NombreProdBuscar;
    private int PrecioProdMod;
    private String NombreProd;
    private String CodigoProd;
    private String TipoProd;
    private int ExistenciaProd;
    private int PrecioProd;

    public String getNombreProdBuscar() {
        return NombreProdBuscar;
    }

    public void setNombreProdBuscar(String NombreProdBuscar) {
        this.NombreProdBuscar = NombreProdBuscar;
    }

    public int getPrecioProdMod() {
        return PrecioProdMod;
    }

    public void setPrecioProdMod(int PrecioProdMod) {
        this.PrecioProdMod = PrecioProdMod;
    }

       
    
    public String getNombreProd() {
        return NombreProd;
    }

    public void setNombreProd(String NombreProd) {
        this.NombreProd = NombreProd;
    }

    public String getCodigoProd() {
        return CodigoProd;
    }

    public void setCodigoProd(String CodigoProd) {
        this.CodigoProd = CodigoProd;
    }

    public String getTipoProd() {
        return TipoProd;
    }

    public void setTipoProd(String TipoProd) {
        this.TipoProd = TipoProd;
    }

    public int getExistenciaProd() {
        return ExistenciaProd;
    }

    public void setExistenciaProd(int ExistenciaProd) {
        this.ExistenciaProd = ExistenciaProd;
    }

    public int getPrecioProd() {
        return PrecioProd;
    }

    public void setPrecioProd(int PrecioProd) {
        this.PrecioProd = PrecioProd;
    }

    

  public String mostrar_info()
  {
      String info = "Nombre: " + getNombreProd() + "\n" +
                    "Codigo: " + getCodigoProd() + "\n" +
                   "Tipo de Producto: " + getTipoProd() + "\n" +
                   "Existencia: " + getExistenciaProd() + "\n" +
                  "Precio: " + getPrecioProd();  
      return info;
   }
  

    
}
