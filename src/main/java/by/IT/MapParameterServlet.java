package by.IT;
import javax.security.sasl.SaslException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
@WebServlet(name = "MapParameterServlet", urlPatterns = "/mapParam")
public class MapParameterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws SaslException, IOException {
        Map<String, String[]> parameterMap = req.getParameterMap();
        PrintWriter writer = resp.getWriter();
        parameterMap.forEach((k, v) -> writer.write("<h1>" + k + "" + Arrays.toString(v) + "</h1>"));
    }
}
///−−•• •− •−−• −•−− − −−−•• −−−−− −−−•• −−−−−
