package logica;

public class citas {
    
    private String CodigoClntCita;
    private String TipoEstudio;
    private String DiaCita;
    private String MesCita;
    private String HoraCita;

    public String getCodigoClntCita() {
        return CodigoClntCita;
    }

    public void setCodigoClntCita(String CodigoClntCita) {
        this.CodigoClntCita = CodigoClntCita;
    }

    public String getTipoEstudio() {
        return TipoEstudio;
    }

    public void setTipoEstudio(String TipoEstudio) {
        this.TipoEstudio = TipoEstudio;
    }

    public String getDiaCita() {
        return DiaCita;
    }

    public void setDiaCita(String DiaCita) {
        this.DiaCita = DiaCita;
    }

    public String getMesCita() {
        return MesCita;
    }

    public void setMesCita(String MesCita) {
        this.MesCita = MesCita;
    }

    public String getHoraCita() {
        return HoraCita;
    }

    public void setHoraCita(String HoraCita) {
        this.HoraCita = HoraCita;
    }
    
public String mostrar_info()
{
    String info = "Codigo: " + getCodigoClntCita() + "\n" +
                  "Tipo de Estudio: " + getTipoEstudio() + "\n" +
                  "Fecha de la Cita:  " + getDiaCita() + getMesCita() + "\n" + 
                  "Hora de la Cita: " + getHoraCita();
    return info;                  
}
    
}
