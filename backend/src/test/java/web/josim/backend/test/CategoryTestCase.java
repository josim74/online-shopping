package web.josim.backend.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.Assert.assertEquals;
import web.josim.backend.dao.CategoryDAO;
import web.josim.backend.dto.Category;

public class CategoryTestCase {
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	private Category category;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("web.josim.backend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	
	/*@Test
	public void testAddCategory() {
		category  = new Category();
		category.setName("Laptop");
		category.setDescription("This is some description for Laptop!");
		category.setImageURL("CAT_2.png");
		
		assertEquals("Seccessfullty added a category inside the table!", true, categoryDAO.add(category));
	}*/

	/*@Test
	public void testGetCategory() {
		category = categoryDAO.get(1);
		assertEquals("Seccessfullty fatched a single category from the table!", "Television", category.getName());
	}*/

	/*@Test
	public void testUpdateCategory() {
		category = categoryDAO.get(1);
		category.setName("TV");
		assertEquals("Seccessfullty updated a single category in the table!", true, categoryDAO.update(category));
	}*/

	/*@Test
	public void testDeleteCategory() {
		category = categoryDAO.get(1);
		assertEquals("Seccessfullty deleted a single category in the table!", true, categoryDAO.delete(category));
	}*/
	
	/*
	@Test
	public void testListCategory() {
		assertEquals("Seccessfullty fatched the list of categories from the table!", 2, categoryDAO.list().size());
	}*/
	
	@Test
	public void testCRUDCategory() {
		category  = new Category();
		category.setName("Laptop");
		category.setDescription("This is some description for Laptop!");
		category.setImageURL("CAT_1.png");
		
		assertEquals("Seccessfullty added Laptop category inside the table!", true, categoryDAO.add(category));
		
		category  = new Category();
		category.setName("Mobile");
		category.setDescription("This is some description for Mobile!");
		category.setImageURL("CAT_2.png");
		
		assertEquals("Seccessfullty added Mobile category inside the table!", true, categoryDAO.add(category));
		
		category  = new Category();
		category.setName("Television");
		category.setDescription("This is some description for Television!");
		category.setImageURL("CAT_3.png");
		
		assertEquals("Seccessfullty added Television category inside the table!", true, categoryDAO.add(category));
		
		//update category
		
		category = categoryDAO.get(3);
		category.setName("TV");
		assertEquals("Seccessfullty updated a single category in the table!", true, categoryDAO.update(category));
		
		//Delete category
		assertEquals("Seccessfullty deleted a single category in the table!", true, categoryDAO.delete(category));
		
		//fetch category

		assertEquals("Seccessfullty fatched the list of categories from the table!", 2, categoryDAO.list().size());
	}
	
	
	
	
}
