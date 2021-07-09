package br.tec.orz.camel.chw.components;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SplitterComponent {
	
	public List<String> splitInput(String body){
		return List.of("ABC","DEF","GHI");
	}

}
