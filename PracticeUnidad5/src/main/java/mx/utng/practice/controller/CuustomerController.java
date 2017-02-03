package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.Cuustomer;
import mx.utng.practice.repository.CuustomerRepository;



@Named
@ViewScoped
public class CuustomerController {
	
	@Autowired
	private CuustomerRepository cuustomerRepository;
	private Cuustomer cuustomer=new Cuustomer();
	private List<Cuustomer>cuustomers;
	private boolean editMode=false;
	
	@PostConstruct
	public void init(){
		setCuustomers(cuustomerRepository.findAll());
	}
	public void save(){
		cuustomerRepository.save(cuustomer);
		if(!editMode){
			getCuustomers().add(cuustomer);
		}
		cuustomer=new Cuustomer();
		setEditMode(false);
	}
	
	public void delete(Cuustomer cuustomer){
		cuustomerRepository.delete(cuustomer);
		cuustomers.remove(cuustomer);
	}
	public void update(Cuustomer cuustomer){
		
		setCuustomer(cuustomer);
		setEditMode(true);
	}
	public void cancel(){
		cuustomer =new Cuustomer();
		setEditMode(false);
	}
	public Cuustomer getCuustomer() {
		return cuustomer;
	}
	public void setCuustomer(Cuustomer cuustomer) {
		this.cuustomer = cuustomer;
	}
	public List<Cuustomer> getCuustomers() {
		return cuustomers;
	}
	public void setCuustomers(List<Cuustomer> cuustomers) {
		this.cuustomers = cuustomers;
	}
	public boolean isEditMode() {
		return editMode;
	}
	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	
	 

}
