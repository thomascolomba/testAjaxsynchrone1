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
@WebServlet(description = "servlet de test pour l'ajax", urlPatterns = { "/MaServlet" })//urlPattern détermine l'url a laquelle va réagir la servlet, description c'est du commentaire -> on s'en fout
public class MaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");//cette ligne signale que la réponse est "plein texte", chez moi elle permet d'éviter des problèmes d'encodage
        response.getWriter().write("Bravo, vous avez cliqué sur le bouton et <br />vous avez réussi à charger ce texte en ajax.<br />Vous êtes très fort.");//pas besoin d'explications pour cette ligne.
	}

}
