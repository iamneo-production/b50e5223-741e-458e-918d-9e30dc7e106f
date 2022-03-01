package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
 
import java.sql.Connection;
import java.sql.SQLException;
 
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
 
import model.BlogList;
import service.RecipeDao;
 
class RecipeDaoTest {
     
    private static RecipeDao dao;
     
    @BeforeAll
    static void init() {
        Connection conn = ConnectionManager.getConnection();
        try {
            conn.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        dao = new RecipeDao(conn);
    }
     
    @AfterAll
    static void teardown() {
        Connection conn = ConnectionManager.getConnection();
        try {
            conn.setAutoCommit(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     
    @Test
    void addListTest() {
        Recipe list = new Recipe();
		list.setRecipeId(1);
        list.setRecipeName("halwa");
        list.setRecipeImageUrl("halwa.png");
		list.setRecipeDescription("tasty dessert");
        dao.addRecipe(list);
        Recipe listFromDb = dao.viewRecipeById(1);
        assertEquals("halwa", listFromDb.getRecipeName(), "Recipe Name must be equal");
    }
    
    @Test
    void deleteListTest() {
        dao.deleteRecipe(1);
        Recipe listFromDb = dao.viewRecipeById(1);
        assertNull(listFromDb.getRecipeName(), "Recipe should be null");
    }
    
    @Test
    void updateListTest() {
        Recipe list = new Recipe();
		list.setRecipeId(1);
        list.setRecipeName("halwa");
        list.setRecipeImageUrl("halwa.png");
		list.setRecipeDescription("tasty dessert");
        dao.addRecipe(list);
        list.setRecipeName("jamun");
        dao.updateRecipe(list);
        Recipe listFromDb = dao.viewRecipeById(1);
        assertEquals("jamun", listFromDb.getRecipeName(), "Recipe Name must be equal");
    }
 
}