package rest.business.models;

import java.util.List;

public interface ThemeDao extends GenericDao<Theme, Integer> {
    
    public Theme findByName(String name);

    public List<String> findAllNames();
}
