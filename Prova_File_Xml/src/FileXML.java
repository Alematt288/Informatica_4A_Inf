import java.io.File;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class FileXML
{

    public void creaXml(JTable table, File file) throws JAXBException
    {
        ArrayList listaBrani = new ArrayList<>();

        for (int row = 0; row < table.getRowCount(); row++)
        {
            Brano brano = new Brano();
            for (int column = 0; column < table.getColumnCount(); column++)
            {
                brano.setTitolo(table.getValueAt(row, 0).toString());
                brano.setAutore(table.getValueAt(row, 1).toString());
            }
            listaBrani.add(brano);
        }
        Writer writer = new Writer();

        writer.setListaBrani(listaBrani);
        JAXBContext context = JAXBContext.newInstance(Brano.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(writer, file);
    }
}