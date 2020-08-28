package model.entities;

import java.util.Date;

public class CarRental {

	private Date start;
	private Date finish;
	
	//Associa��es
	private Vehicle vehicle;
	private Invoice invoice;
	
	//Construtor padr�o
	public CarRental() {
	}

	//Construtor com os campos
	public CarRental(Date start, Date finish, Vehicle vehicle) {
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
	}

	//Getters and Setters
	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getFinish() {
		return finish;
	}

	public void setFinish(Date finish) {
		this.finish = finish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
}
