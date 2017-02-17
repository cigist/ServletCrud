/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cigist.jsprud.controller;

import com.cigist.jsprud.dao.MasterUserDao;
import com.cigist.jsprud.impl.MasterUserImpl;
import com.cigist.jsprud.model.MasterUserBean;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cigist
 */
@WebServlet(name = "MstUserServlet", urlPatterns = {"/MstUserServlet"})
public class MstUserServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static String LIST_USER = "/mstuser.jsp";

    MasterUserDao crud = new MasterUserImpl();

    public MstUserServlet() {
        super();
    }

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

        String forward = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("listuser")) {
            forward = LIST_USER;
            String json = new Gson().toJson(crud.getAllDataUser());
            response.setContentType("application/json");
            response.getWriter().write(json);
        } else if (action.equalsIgnoreCase("delete")) {
            crud.deleteUser(request.getParameter("userId"));
            forward = LIST_USER;
        } else if (action.equalsIgnoreCase("listby")) {
            forward = LIST_USER;
            String json = new Gson().toJson(crud.getDataByCode(request.getParameter("userby")));
            response.setContentType("application/json");
            RequestDispatcher view = request.getRequestDispatcher("mstuser.jsp");
            view.forward(request, response);
            
        } else {
            forward = LIST_USER;
        }

//        RequestDispatcher view = request.getRequestDispatcher(forward);
//        view.forward(request, response);
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

//        response.setContentType("application/json");
//        Gson gson = new Gson();
//        JsonParser parser = new JsonParser();
//        JsonObject obj = new JsonObject();
//        obj = (JsonObject) parser.parse(request.getReader().toString());
        MasterUserBean userBean = new MasterUserBean();
//        userBean.setCdUser(obj.get("cdUser").toString());
//        userBean.setUsername(obj.get("username").toString());
//        userBean.setPassword(obj.get("password").toString());
//        userBean.setName(obj.get("name").toString());
//        userBean.setFlagActive(obj.get("flagActive").toString());

        userBean.setCdUser(request.getParameter("userId"));
        userBean.setUsername(request.getParameter("username"));
        userBean.setPassword(request.getParameter("password"));
        userBean.setName(request.getParameter("name"));
        userBean.setFlagActive(request.getParameter("flagActive"));

        crud.addUser(userBean);

        RequestDispatcher view = request.getRequestDispatcher("mstuser.jsp");
        view.forward(request, response);

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
