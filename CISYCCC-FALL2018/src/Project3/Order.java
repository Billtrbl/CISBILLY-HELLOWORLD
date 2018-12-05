package Project3;

public class Order {

	private static final int pen = 2; // Constant 
	private static final int pencil = 1; // price of item ($)
	private static final int ruler = 4; // per item
	private int penQty; // QTY for items
	private int pencilQty;
	private int rulerQty;
	private Address address; // create an object of address class
	private User userID; // create an object of user class
	private int cost; // create an object of int type

	public int getCost() {
		cost = (penQty * pen) + (pencilQty * pencil) + (rulerQty * ruler); // formula to calculate the cost
		return cost;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public User getUserID() {
		return userID;
	}

	public void setUserID(User userID) {
		this.userID = userID;
	}

	public int getPenQty() {
		return penQty;
	}

	public void setPenQty(int penQty) {
		this.penQty = penQty;
	}

	public int getPencilQty() {
		return pencilQty;
	}

	public void setPencilQty(int pencilQty) {
		this.pencilQty = pencilQty;
	}

	public int getRulerQty() {
		return rulerQty;
	}

	public void setRulerQty(int rulerQty) {
		this.rulerQty = rulerQty;
	}

}
