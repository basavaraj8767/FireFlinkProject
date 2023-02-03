package ty1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

public class PDFreadtest {
	@Test
	public void test() throws IOException, SAXException, TikaException {
		FileInputStream fis = new FileInputStream("./src/test/resources/data/Basavaraj A Patil.pdf");
		BodyContentHandler contenthandler = new BodyContentHandler();
		Metadata matadata = new Metadata();
		ParseContext parsecontext = new ParseContext();
		PDFParser parser = new PDFParser();
		parser.parse(fis, contenthandler, matadata, parsecontext);
		System.out.println(contenthandler.toString());
	}
}
                       