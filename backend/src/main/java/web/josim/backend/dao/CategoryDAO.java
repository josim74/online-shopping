package web.josim.backend.dao;

import java.util.List;

import web.josim.backend.dto.Category;

public interface CategoryDAO {
	List<Category> list();
	Category get(int id);
}
