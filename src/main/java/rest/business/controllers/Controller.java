package rest.business.controllers;

import java.util.ArrayList;
import java.util.List;

import rest.business.models.DaoFactory;
import rest.business.models.Theme;
import rest.business.models.ThemeDao;
import rest.business.models.Vote;
import rest.business.models.VoteDao;
import rest.business.views.ThemeTransfer;
import rest.business.views.VoteTransfer;

public class Controller {

	public List<String> getThemes() {
		List<Theme> themes = DaoFactory.getFactory().getThemeDao().findAll();
		List<String> names = new  ArrayList<String>();
		
		for(int i=0;i<themes.size();i++){
			names.add(themes.get(i).getName());
		}
		return names;
	}

	public void createTheme(String name) {
		ThemeDao themeDao = DaoFactory.getFactory().getThemeDao();
		int id = themeDao.findAll().size();

		themeDao.create(new Theme(id,name));
	}

	public List<ThemeTransfer> getVotes() {
		List<Theme> themes = DaoFactory.getFactory().getThemeDao().findAll();
		List<Vote> votes = DaoFactory.getFactory().getVoteDao().findAll();
		
		List<ThemeTransfer> themeTransfer = new ArrayList<ThemeTransfer>();
		
		for(Theme theme:themes){
			themeTransfer.add(new ThemeTransfer(theme.getName(), average(votes,theme.getName())));
		}
		
		return themeTransfer;
	}
	
	public double average(List<Vote> votes, String name ){
		double sum = 0.0;
		for(int i = 0; i<votes.size();i++){
			sum += votes.get(i).getVote();
		}
		return sum/votes.size();
	}

	public void vote(VoteTransfer voteTransfer) {
		VoteDao voteDao = DaoFactory.getFactory().getVoteDao();
		ThemeDao themeDao = DaoFactory.getFactory().getThemeDao();
		
		int newID = voteDao.findAll().size();
		
		voteDao.create(new Vote(newID, (int) voteTransfer.getNum(), themeDao.findByName(voteTransfer.getName())));
		
	}

}
