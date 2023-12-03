package git;

import java.util.Objects;

public class Livre extends Documents {
	String auteur;
	String date_apparution;
	public Livre(String titre, String format, String id, String auteur, String date_apparution) {
		super(titre, format, id);
		this.auteur = auteur;
		this.date_apparution = date_apparution;
	}
	
	@Override
	public String toString() {
		return  super.toString()+" ,auteur=" + auteur + ", date_apparution=" + date_apparution ;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(super.equals(obj)==false) return false;
		if(obj instanceof  Livre  ) {
		Livre other = (Livre) obj;
		return Objects.equals(date_apparution, other.date_apparution) && this.auteur==other.auteur;}
		return false;
	}
	@Override
	public Livre clone() {
		// TODO Auto-generated method stub
		
		return (Livre) super.clone();
	}
	@Override
	public int compareTo(Documents o) {
		// TODO Auto-generated method stub
		return super.compareTo(o);
	}
	
	
	
	
	
	

}
