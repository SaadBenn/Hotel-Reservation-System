/**
 * 
 */

/**
 * @author saadkhan
 *
 */
abstract class Information {
 private String name;
 private int ID;
 private List reservationList;
 
 public Information(String name, int ID ) {
	 this.name = name;
	 this.ID = ID;
	 reservationList = new List();
 }
 
 public void addRes(Reservations res) {
	reservationList.add(res); 
 }
 
 
// public List getList() {
//	 return reservationList;
// }
 
// public void print() {
//	 reservationList.print();
// }
 public int getID() { return ID; }
 public String getName() { return name; }
 
 public void setID(int id){ this.ID = id; }
 public void setName(String name){ this.name = name; }
 
 public String toString() {
		return getID() + " " + getName();
	}
}










