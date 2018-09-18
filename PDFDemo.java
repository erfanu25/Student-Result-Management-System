package pdfdemo;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

/**
 *
 * @author Kaniz
 */
public class PDFDemo {
    public static void main(String[] args){
        Document doc = new Document(PageSize.A4);
        
        System.out.println("Document created..");
        try{
            PdfWriter.getInstance(doc, new FileOutputStream("PDF1.pdf"));
            doc.addAuthor("Bithy");
            doc.addTitle("PDF Demo");
            doc.addSubject("Learning PDF in Java");
            System.out.println("Writer instance created..");               
            doc.open();
            System.out.println("Document opened..");
            Paragraph para = new Paragraph("Hello World!!");
            doc.add(para);
            System.out.println("Para added to Document.");
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        doc.close();
        System.out.println("Document closed ..");
    }
}
