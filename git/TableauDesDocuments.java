package git;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;




public class TableauDesDocuments {
			private Documents[] doc= new Documents[3];

			public TableauDesDocuments() {
				doc[0]=new Documents("MATHEMATIQUE","PDF","A200");
				doc[1]=new Documents("FRANCAIS","PDF","A500");
				doc[2]=new Livre("ARABE","WORD","A400","ouail","10/01/2020"); // Plyporphisme
				
			}
			public void trier() {
				Arrays.sort(doc);			
			}
			public void ajouter(Documents d) {
				/*if(pos>=0 && pos<=doc.length) {
						ArrayList<Documents> liste = new ArrayList<Documents>(Arrays.asList(doc));
						liste.add(pos,d);
						doc= liste.toArray(new Documents[liste.size()]);
				}
				throw new IllegalArgumentException("la position doit etre comprise entre 0 et la taille");
				*/
				
				
				doc = Arrays.copyOf(doc, doc.length+1);
				doc[doc.length-1]= d;
				
				
			}
			//Tester l existance d un documens donner en parametre dans le tableau
			public boolean tester(Documents d) {
				for(Documents i: doc)
					if(i.equals(d))
						return true;
				
				return false;
				
			}
			
			public boolean supprimer(Documents d) {
				if(!this.tester(d))
					return false;
				ArrayList<Documents> liste = new ArrayList<Documents>(Arrays.asList(doc));
				liste.remove(d);
				doc= liste.toArray(new Documents[liste.size()]);
				return true;
				
			}
			
			public int compterNombre(Documents d) {
				
				return doc.length;
				
			}
			public void inverser() {
				ArrayList<Documents> liste = new ArrayList<Documents>(Arrays.asList(doc));
				Collections.reverse(liste);
				doc=liste.toArray(new Documents [liste.size()]);
			}
			public void afficher() {
				for(Documents d:doc) {
					
					System.out.println(d);
				}
			}
			public Documents DocumentsplusGrandeDocuments() {
				/*Documents d = doc[0];
				for(Documents d1: doc)
					if(d1.compareTo(d)>0)
						d=d1;
				return d;*/
				
				
				Arrays.sort(doc);
				return doc[doc.length-1];
				
			}
			public boolean testerdeuxTableaux(Documents[] d1) {
				return Arrays.equals(doc,d1);				
			}
			
			
			
			
			
			
			
			
}
