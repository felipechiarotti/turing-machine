package turingmachine.machine;

import java.util.ArrayList;

public class Transition {
	private String currentState;
	private ArrayList<Function> function;

	
	public Transition(String currentState, char read, String nextState, char write, int direction){
		this.currentState = currentState;
		function = new ArrayList<Function>();
		function.add(new Function(read,write,nextState,direction));
	}
	
	public String run(char c) throws Exception{
		for(Function f : function){
			if(f.getRead() == c){
				return f.getWrite()+"/"+f.getNextState()+"/"+f.getDirection();
			}
		}
		throw new Exception("Transição inexistente! Máquina PAROU");
	}
	
	public void addFunction(Function f){
		this.function.add(f);
	}
	public String getCurrentState() {
		return currentState;
	}
	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}
}
