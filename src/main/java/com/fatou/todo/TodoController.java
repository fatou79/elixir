package com.fatou.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {


@Autowired
TodoService perfume;


@RequestMapping(value = "/list-todo", method = RequestMethod.GET)

public String retrieveTodos(ModelMap model) {
	model.addAttribute("todos", perfume.retrieveTodos("elixir"));
	return "list-todo";
	
}

}