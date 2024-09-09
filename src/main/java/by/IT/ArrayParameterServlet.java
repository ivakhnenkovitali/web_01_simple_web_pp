package by.IT;
import javax.security.sasl.SaslException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Hashtable;
@WebServlet(name = "arrayParameterServlet", urlPatterns = "/arrParams")
public class ArrayParameterServlet extends HttpServlet {
    @Override
    protected  void doGet(HttpServletRequest req, HttpServletResponse resp) throws SaslException, IOException{
        String[] parames = req.getParameterValues( "parame");
        PrintWriter writer= resp.getWriter();
        Arrays.stream(parames).forEach(it -> writer.write("<h1>"+ it + "</h1"));
    }
}
