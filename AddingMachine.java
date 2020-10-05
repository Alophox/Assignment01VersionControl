package cse360assignment02;

public class AddingMachine {
	private int total; //holds the total
	private String history; //holds history of operations in string form
	/**
	 * Constructor
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0"; //is needed
	}
	/**
	 * returns total
	 * @return total(currently returns 0)
	 */
	public int getTotal () {
		return this.total;
	}
	/**
	 * adds value to total
	 * @param value, to be added
	 */
	public void add (int value) {
		this.total = this.total + value;
		this.history = this.history.concat(" + " + value);
	}
	/**
	 * subtracts value from total
	 * @param value, to be subtracted
	 */
	public void subtract (int value) {
		this.total = this.total - value;
		this.history = this.history.concat(" - " + value);
	}
	/**
	 * TODO: implement
	 * @return all operations put into a string
	 * ie. add(2); sub(4);
	 * toString() will return
	 * 0 + 2 - 4
	 */
	public String toString () {
		return history;
	}
	/**
	 * 
	 * clears operations from total and history
	 */
	public void clear() {
		this.total=0;
		this.history="0";
	}
}