package web.presentation.frontController;

import web.http.HttpRequest;
import web.http.HttpResponse;
import web.presentation.models.Model;
import web.presentation.presenters.ThemeManagerPresenter;
import web.presentation.presenters.VotingPresenter;
import web.presentation.views.*;


public class Dispatcher {

	public void doGet(HttpRequest request, HttpResponse response) {
		String next = "";
		Model model = new Model();
		String option = request.getPath();
		
		if(option == "Voting"){
			ThemeManagerPresenter themeManagerPresenter = new ThemeManagerPresenter();
			next = themeManagerPresenter.proccess(model);
		} else if(option == "ThemeManager"){
			VotingPresenter votingPresenter = new VotingPresenter();
			next = votingPresenter.process(model);
		}

		show(next,model);
	}

	public void doPost(HttpRequest request, HttpResponse response) {
		Model model = new Model();
		String option = request.getPath();
		String nextOption = request.getPath()+"View";
		String theme = request.getParams().get("themeName");
		String action = request.getParams().get("action");
		String vote = request.getParams().get("value");
		
		if(option == "ThemeManager"){
			ThemeManagerPresenter themeManagerPresenter = new ThemeManagerPresenter();
			model.put("themeName", theme);
			if(action == "createTheme"){
				option = themeManagerPresenter.createTheme(model);
			} else{				
				model.put("error", "No encontrado "+option);
			}

		} else if(option == "Voting"){
			VotingPresenter votingPresenter = new VotingPresenter();
			model.put("themeName", theme);
			model.put("voteValue", vote);
			if(action == "voteTheme"){
				option = votingPresenter.voteTheme(model);
			} else{
				model.put("error", "No encontrado "+option);
			}
		}
		show(nextOption, model);
	}

	
	private void show(String next, Model model) {
		View view;
		if(next.equals("VotingView")){
			view = new VotingView();
		} 
		else if(next.equals("ThemeManagerView")){
			view = new ThemeManagerView();
		}else{
			view = new ErrorView();
			model.put("error", "No encontrado "+next);
		}
		view.show(model);
	}
}
