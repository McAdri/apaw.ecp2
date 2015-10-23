package web.presentation.views;

import web.presentation.models.Model;

public class ThemeManagerView implements View {

	@Override
	public void show(Model model) {
		System.out.println("Theme Manager Page \t");
		System.out.print("Temas :[");
		for (String name : model.getMap().keySet()) {
            System.out.print(model.getMap().get(name)+", ");
           
        }
		System.out.println("]");
	}

	
	
}
