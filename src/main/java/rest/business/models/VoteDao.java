package rest.business.models;

import java.util.List;

public interface VoteDao extends GenericDao<Vote, Integer>{

	 public List<Vote> findByTheme(Theme theme);
}