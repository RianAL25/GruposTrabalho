/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Beans;

import Util.Util;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rian Alves Leal <ral2 at aluno.ifnmg.edu.br>
 */

@WebServlet(name = "PessoaServlet", urlPatterns = {"/Relatorios"})
public class PessoaServlet extends HttpServlet {
    
    @Inject
    private PessoaBeanLocal pessoaBean;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
//            out.println("<title>Servlet PessoaServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Desenvolvimento Web</p>");
            out.println("<h1>Estudo Dirigido: Jakarta Persistence Query Language</h1>");
            out.println("<a href=\"/GruposTrabalho-1.0\">Voltar</a>");
            out.println("</body>");
            out.println("</html>");
            //--
//            out.println("<h2>Consulta 1.A: Quais as pessoas (dados completos) cadastradas? Por meio de Query</h2>");
//            out.println("<pre class=\"high\">"
//                    + Util.toJson(pessoaBean.findAllPessoa())
//                    + "</pre>");
//            //--
//            out.println("<h2>Consulta 1.B: Quais as pessoas (dados completos) cadastradas? Por meio de TypedQuery</h2>");
//            out.println("<pre class=\"high\">"
//                    + Util.toJson(pessoaBean.findAllPessoaTyped())
//                    + "</pre>");
//            //--
//            out.println("<h2>Consulta 1.C: Quais as pessoas (dados completos) cadastradas? Por meio de NamedQuery</h2>");
//            out.println("<pre class=\"high\">"
//                    + Util.toJson(pessoaBean.findAllPessoaNamed())
//                    + "</pre>");
            //--
            out.println("<h2>Consulta 2.A: Quais os nomes das pessoas? Por meio de Query</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findNamePessoaQuery())
                    + "</pre>");
            //--
            out.println("<h2>Consulta 2.B: Quais os nomes das pessoas? Por meio de TypedQuery</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findNamePessoaTyped())
                    + "</pre>");
            //--
            out.println("<h2>Consulta 2.C: Quais os nomes das pessoas? Por meio de NamedQuery</h2>");
            out.println("<pre class=\"high\">"
                    + Util.toJson(pessoaBean.findNamePessoaNamed())
                    + "</pre>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
