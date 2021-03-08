package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 799768
 */
public class ShoppingListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String action = request.getParameter("action");
        
        if (action != null && action.equals("logout")) {
            session.invalidate();
            session = request.getSession();
            String message = "Successfully logged out";
            request.setAttribute("message", message);
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String action = (String) request.getParameter("action");
        
        if (action.equals("register")) {
            String username = request.getParameter("username");
            session.setAttribute("username", username);
            getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
        } else if (action.equals("logout")) {
            session.invalidate();
            session = request.getSession();
            
            String message = "Successfully logged out";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        } else if (action.equals("add")) {
            String item = request.getParameter("item");
            ArrayList<String> items;
            items = (ArrayList<String>) session.getAttribute("items");
            items.add(item);
            session.setAttribute("items", items);
            getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
        } else if (action.equals("delete")) {
            ArrayList<String> items;
            items = (ArrayList<String>) session.getAttribute("items");
            session.setAttribute("items", items);
            getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
        }
    }
}
