package cicero.controller;

import cicero.entity.EventosEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Controller
@RequestMapping("/agenda")
public class AgendaController {

	
	@RequestMapping(value = "/montaAgenda")
	public String montaAgenda() {
		 
		//ModelAndView mv = new ModelAndView("AgendaEventos");
		
		return "AgendaEventos";
	}
	
	@RequestMapping(value = "/getEventos.json", method = RequestMethod.GET)
	public @ResponseBody
	List<EventosEntity> GetEventos(){

		List<EventosEntity> eventos = new ArrayList<EventosEntity>();
				
		String mesAtual = String.valueOf(Calendar.getInstance().get(Calendar.MONTH)+ 1);
		
		if(mesAtual.length() <2)
			mesAtual = "0" + mesAtual;
		
		String anoAtual = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
				
		/*ADICIONANDO OS EVENTOS*/
		eventos.add(new EventosEntity("Estudar Linux",     anoAtual+"-"+mesAtual+"-02T12:00:00",anoAtual+"-"+mesAtual+"-02T13:30:00", null));
		eventos.add(new EventosEntity("Estudar Java", 	   anoAtual+"-"+mesAtual+"-02T14:00:00",anoAtual+"-"+mesAtual+"-02T14:30:00", null));
		eventos.add(new EventosEntity("Estudar C#", 	   anoAtual+"-"+mesAtual+"-02T15:00:00",anoAtual+"-"+mesAtual+"-02T15:30:00", null));
		eventos.add(new EventosEntity("Estudar SOA Suite", anoAtual+"-"+mesAtual+"-02T16:00:00",anoAtual+"-"+mesAtual+"-02T17:30:00", null));
		eventos.add(new EventosEntity("Estudar Jquery",    anoAtual+"-"+mesAtual+"-02T19:00:00",anoAtual+"-"+mesAtual+"-02T20:30:00", null));		
		eventos.add(new EventosEntity("Correr",     	   anoAtual+"-"+mesAtual+"-03T13:00:00",anoAtual+"-"+mesAtual+"-03T13:30:00", null));
		eventos.add(new EventosEntity("Reuni�o",	       anoAtual+"-"+mesAtual+"-05T12:00:00",anoAtual+"-"+mesAtual+"-05T13:30:00", null));		
		eventos.add(new EventosEntity("Dois dias de evento", anoAtual+"-"+mesAtual+"-07T12:00:00",anoAtual+"-"+mesAtual+"-08T12:00:00", null));
		
		eventos.add(new EventosEntity("Publicar Artigo",   anoAtual+"-"+mesAtual+"-10T12:00:00",anoAtual+"-"+mesAtual+"-10T13:30:00", null));
		eventos.add(new EventosEntity("Reuni�o",	       anoAtual+"-"+mesAtual+"-10T15:00:00",anoAtual+"-"+mesAtual+"-10T18:30:00", null));		
		
		eventos.add(new EventosEntity("Festa",  		   anoAtual+"-"+mesAtual+"-13T12:00:00",anoAtual+"-"+mesAtual+"-13T13:30:00", null));
		eventos.add(new EventosEntity("Festa 2",	       anoAtual+"-"+mesAtual+"-13T15:00:00",anoAtual+"-"+mesAtual+"-13T18:30:00", null));		
		eventos.add(new EventosEntity("Curso de Ingl�s",   anoAtual+"-"+mesAtual+"-15",null, null));				
		eventos.add(new EventosEntity("Blog C�cero",       anoAtual+"-"+mesAtual+"-23",null, "http://www.ciceroednilson.com.br"));
				
		return eventos;
		
	}
	
}
