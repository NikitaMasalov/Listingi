package listing.main.qwerty.src.block7;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class Transform {
    public static void main (String[] args) {
        if (args.length <1) {
            System.out.println("Usage: java Transform имя_файла_xml");
            System.exit(0);
        }
        File xslFile = new File(args[0]);
        File xmlFile = new File(args[1]);

        StreamSource xslSource = new StreamSource(xslFile);
        StreamSource xmlSource = new StreamSource(xmlFile);
        StreamSource outResult = new StreamSource(String.valueOf(System.out));

        try {
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(xslSource);
            transformer.transform(xmlSource, (Result) outResult);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
}
