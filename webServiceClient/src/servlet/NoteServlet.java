package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ws.NoteProxy;

/**
 * Servlet implementation class NoteServlet
 */
@WebServlet("/NoteServlet")
public class NoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/Resultat.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idEtudiant = request.getParameter("idEtudiant");
		String note = request.getParameter("noteEtudiant");
		String action = request.getParameter("options-list");
		NoteProxy service = new NoteProxy();
		String resultat = null;
		
		if (action.equals("ajouter")) {
			resultat = service.ajouterNote(idEtudiant, note);
		} else if (action.equals("supprimer")) {
			resultat = service.supprimerNote(idEtudiant, note);
		}  else if (action.equals("lister")) {
			resultat = service.listerNote();
		} else if (action.equals("modifier")) {
			resultat = service.modifierNote(idEtudiant, note);
		}
		
		request.setAttribute("resultat", resultat);
		doGet(request, response);
	}

}
