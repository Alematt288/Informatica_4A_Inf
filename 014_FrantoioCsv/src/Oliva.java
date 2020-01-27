import java.util.Calendar;
import java.util.StringTokenizer;

public class Oliva
{

    private String codiceOliva;
    private ColoreOliva coloreOliva;
    private MaturazioneOliva maturazioneOliva;
    private Calendar dataRaccolta;

    public Oliva() { super(); }
    public Oliva(String codiceOliva, ColoreOliva coloreOliva, MaturazioneOliva maturazioneOliva, Calendar dataRaccolta) {
        this.codiceOliva = codiceOliva;
        this.coloreOliva = coloreOliva;
        this.maturazioneOliva = maturazioneOliva;
        this.dataRaccolta = dataRaccolta;
    }

    public void setCodiceOliva(String codiceOliva) {this.codiceOliva = codiceOliva;}
    public void setColoreOliva(ColoreOliva coloreOliva) {this.coloreOliva = coloreOliva;}
    public void setMaturazioneOliva(MaturazioneOliva maturazioneOliva) {this.maturazioneOliva = maturazioneOliva;}
    public void setDataRaccolta(Calendar dataRaccolta) {this.dataRaccolta = dataRaccolta;}
    public String getCodiceOliva() {return codiceOliva;}
    public ColoreOliva getColoreOliva() {return coloreOliva;}
    public MaturazioneOliva getMaturazioneOliva() {return maturazioneOliva;}
    public Calendar getDataRaccolta() {return dataRaccolta;}

    public String toString()
    {
        return "Oliva{" +
                "codiceOliva='" + codiceOliva + '\'' +
                ", coloreOliva=" + coloreOliva +
                ", maturazioneOliva=" + maturazioneOliva +
                ", dataRaccolta=" + dataRaccolta +
                '}';
    }

    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Oliva oliva = (Oliva) o;

        if (codiceOliva != null ? !codiceOliva.equals(oliva.codiceOliva) : oliva.codiceOliva != null) return false;
        if (coloreOliva != oliva.coloreOliva) return false;
        if (maturazioneOliva != oliva.maturazioneOliva) return false;
        return dataRaccolta != null ? dataRaccolta.equals(oliva.dataRaccolta) : oliva.dataRaccolta == null;

    }

    public void caricaDaCsv(String linea)
    {
        StringTokenizer st = new StringTokenizer(linea, FrantoioCsv.SEPARATOR);

        int cntCampi = 0;
        while (st.hasMoreElements())
        {
            //linea contiene un formato riga csv, così definito:
            // 0:codiceOliva, 1:coloreOliva, 2:maturazioneOliva, 3:dataRaccolta
            String campoCsv = (String) st.nextElement();

            switch (cntCampi)
            {
                case 0: codiceOliva = campoCsv;
                        break;
                case 1:
                    if(campoCsv.equalsIgnoreCase("1"))
                    {
                        coloreOliva = ColoreOliva.VERDE;
                    }
                    if(campoCsv.equalsIgnoreCase("2"))
                    {
                        coloreOliva = ColoreOliva.NERO;
                    }
                    if(campoCsv.equalsIgnoreCase("3"))
                    {
                        coloreOliva = ColoreOliva.MARRONE;
                    }
                    break;
                case 2:
                    int tipoMaturazione = new Integer(campoCsv).intValue();
                    switch (tipoMaturazione)
                    {
                        case 1:
                            maturazioneOliva = MaturazioneOliva.PICCOLA;
                            break;
                        case 2:
                            maturazioneOliva = MaturazioneOliva.ACERBA;
                            break;
                        case 3:
                            maturazioneOliva = MaturazioneOliva.MATURA;
                            break;
                        case 4:
                            maturazioneOliva = MaturazioneOliva.MARCITURA;
                            break;
                    }
                    break;
                case 3:
                    dataRaccolta = InputOutputUtility.leggiDataOraCalendar(campoCsv, InputOutputUtility.dfDayHour);
                    break;
            }


            cntCampi++;
        }
    }

    public String generaRigaCsv()
    {
        return this.codiceOliva + FrantoioCsv.SEPARATOR
                + this.coloreOliva + FrantoioCsv.SEPARATOR
                + this.maturazioneOliva + FrantoioCsv.SEPARATOR
                + InputOutputUtility.convertDataOra(this.dataRaccolta, InputOutputUtility.dfDay);
    }
}
