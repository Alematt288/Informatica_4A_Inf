import java.util.Date;
import java.util.GregorianCalendar;

public class NaveMerci extends Nave
{

	public NaveMerci()
	{
		super();
	}
	
	public NaveMerci(int tipoNave, float lunghezza, float larghezza, Date dataArrivo, int numeroPosizioneAttracco, String compagnia, GregorianCalendar tempoDiPermanenza)
	{
		super(tipoNave, lunghezza, larghezza, dataArrivo, numeroPosizioneAttracco, compagnia, tempoDiPermanenza);
	}

	public static void creaNave (Nave elencoNavi[], int cntNave, InputOutputUtility t)
	{
		elencoNavi[cntNave] = new NaveMerci();
		Nave.caricaNave(elencoNavi, cntNave, t);
	}
	
	public String toString()
	{
		String s = new String(super.toString());
		
		return s;
	}
}
