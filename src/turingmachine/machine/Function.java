package turingmachine.machine;

import java.util.ArrayList;

public class Function {
	private char read;
	private char write;
	private String nextState;
	private int direction;
	
	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public Function(char read, char write, String nextState, int direction){
		this.read = read;
		this.write = write;
		this.nextState = nextState;
		this.direction = direction;
	}
	
	public char getRead() {
		return read;
	}

	public void setRead(char read) {
		this.read = read;
	}

	public char getWrite() {
		return write;
	}

	public void setWrite(char write) {
		this.write = write;
	}

	public String getNextState() {
		return nextState;
	}

	public void setNextState(String nextState) {
		this.nextState = nextState;
	}
}
