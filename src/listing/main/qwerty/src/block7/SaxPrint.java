package listing.main.qwerty.src.block7;

import java.io.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
public class SaxPrint  extends DefaultHandler {
    public void startDocument() throws SAXException {
        System.out.println("Начало документа");
    }
    public void endDocument() throws SAXException{
        System.out.println("");
        System.out.println("Конец документ");
    }
    public void startElement (String uri, String Iname, String qName, Attributes attrebs) throws SAXException{
        System.out.println("");
        System.out.println(" Начало" + qName);

        if (attrebs.getLength() > 0) {
            for (int i = 0; i < attrebs.getLength(); i++) {
                System.out.println("   ." + attrebs.getQName(i) + "=" + attrebs.getValue(i));
            }
        }
    }
    public void endElement (String uri, String IName, String qName) throws SAXException{
        System.out.println(" Конец" + qName);
    }
    public void characters (char[] data, int start, int length) throws SAXException {
        StringBuffer buf  = new StringBuffer(length);
        buf.append(data, start, length);
        if (buf.toString().trim().length() > 0) {
            System.out.println(" " +buf);
        }
    }

    public static void main (String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java SaxPrint имя_файла_xml");
            System.exit(0);
        }
        try {
            File docFile = new File("y:\test.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            parser.parse(docFile, new SaxPrint());
        }catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
