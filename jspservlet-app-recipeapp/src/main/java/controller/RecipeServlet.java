package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Recipe;
import service.RecipeDAO;

@WebServlet("/RecipeServlet")

public class RecipeServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;
    private RecipeDAO recipeDAO;

    public RecipeServlet(){
        this.recipeDAO =new RecipeDAO();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        this.doGet(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String action = request.getServletPath();

        switch(action){
            case "/insert":
                try{
                    insertRecipe(request, response);
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
                break;
            case "/delete":
                try{
                    deleteRecipe(request, response);
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
                break;
            case "/update":
                try{
                    updateRecipe(request, response);
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
                break;
            default:
                break;
        }
    }
    private void insertRecipe(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String name=request.getParameter("name");
        String url=request.getParameter("url");
        String description=request.getParameter("description");
        
        Recipe newRecipe = new Recipe(name, url, description);
        recipeDAO.insertRecipe(newRecipe);

    }
    private void deleteRecipe(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int id=Integer.parseInt(request.getParameter("id"));
        recipeDAO.deleteRecipe(id);

    }

    private void updateRecipe(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int id=Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        String url=request.getParameter("url");
        String description=request.getParameter("description");
        
        Recipe recipe = new Recipe(id, name, url, description);
        recipeDAO.updateRecipe(recipe);

    }

}
