package service;
import utility.ConnectionManager;
import model.Recipe;

import java.sql.*; 
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RecipeDAO{
    public boolean insertRecipe(Recipe recipe) throws SQLException
    {
        boolean rowInserted=true;
        try {
            Connection con = ConnectionManager.initializeDatabase();
            PreparedStatement st = con.prepareStatement("insert into recipe"+ "(id, name, url, description) values "+ "(?, ?, ?, ?);");
            st.setInt(1, recipe.getId());
            st.setString(2, recipe.getName());
            st.setString(3, recipe.getUrl());
            st.setString(4, recipe.getDescription());
            
            rowInserted = st.executeUpdate()>0;
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return rowInserted;
    
    }
    //update recipe
    public boolean updateRecipe(Recipe recipe) throws SQLException{
        boolean rowUpdated=true;
        try{
            Connection con = ConnectionManager.initializeDatabase();
            PreparedStatement st = con.prepareStatement("Update recipe set name=?, url = ?, description=? where id=?;");
            st.setInt(1, recipe.getId());
            st.setString(2, recipe.getName());
            st.setString(3, recipe.getUrl());
            st.setString(4, recipe.getDescription());

            rowUpdated = st.executeUpdate()>0;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return rowUpdated;
    }

// viewRecipeById() 
public Recipe viewRecipeById(int id) {
    Recipe recipe = null;
    try{
        Connection con = ConnectionManager.initializeDatabase();
        PreparedStatement st = con.prepareStatement("Select * from recipe where id=?;");
        st.setInt(1, id);
        ResultSet rs=st.executeQuery();

        while(rs.next()){
            String name=rs.getString("name");
            String url=rs.getString("url");
            String description=rs.getString("description");
            recipe=new Recipe(id, name, url, description);
        }
    }
    catch(SQLException e){
        e.printStackTrace();
    }
    return recipe;
}

//deleteRecipe(recipeId)
public boolean deleteRecipe(int id) throws SQLException{
    boolean rowDeleted=true;
    try{
        Connection con = ConnectionManager.initializeDatabase();
        PreparedStatement st = con.prepareStatement("delete from recipe where id=?;");
        st.setInt(1, id);
        rowDeleted = st.executeUpdate()>0;
    }
    catch(SQLException e){
        e.printStackTrace();
    }
    return rowDeleted;
}

}

