package tcoServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MaServlet
 */
@WebServlet(description = "servlet de test pour l'ajax", urlPatterns = { "/MaServlet" })//urlPattern d�termine l'url a laquelle va r�agir la servlet, description c'est du commentaire -> on s'en fout
public class MaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");//cette ligne signale que la r�ponse est "plein texte", chez moi elle permet d'�viter des probl�mes d'encodage
        response.getWriter().write("Bravo, vous avez cliqu� sur le bouton et <br />vous avez r�ussi � charger ce texte en ajax.<br />Vous �tes tr�s fort.");//pas besoin d'explications pour cette ligne.
	}

}
