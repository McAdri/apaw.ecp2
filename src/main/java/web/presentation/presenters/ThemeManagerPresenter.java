package web.presentation.presenters;

import java.util.List;

import rest.business.controllers.Controller;
import web.presentation.models.Model;

public class ThemeManagerPresenter {

	

	public String createTheme(Model model) {
		Controller controller = new Controller();
		controller.createTheme((String) model.get("themeName"));
		proccess(model);
		return "ThemeManagerView";
	}

	public String proccess(Model model) {
		List<String> themes = new Controller().getThemes();
		for(String name : themes){
			model.put(name, name);
		}
		return "ThemeManagerView";
	}
	
}
