package git;

import java.util.ArrayList;	
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;




public class ListeDesDocuments {
		ArrayList<Documents> doc =new ArrayList<Documents>();
		
		public void alimenter() {
			
			doc.add(new Documents("MATHEMATIQUE","PDF","A200"));
			doc.add(new Documents("FRANCAIS","PDF","A50"));
			doc.add(new Livre("ARABE","WORD","A400","ouail","10/01/2020"));
		}
		public void afficher() {
			
			for(Documents d:doc) {
				System.out.println(d);
			}
			
		}
		public void parcourir() {
			Iterator<Documents> it = doc.iterator();
			//has next tru fals pour verifier si un elemnt existe ou pas
			while(it.hasNext()) {
				System.out.println(it.next());
				//it.next() recupere elements
				}
		}
		public void ajouter(Documents d) {
			doc.add(0, d);
		}
		
		public Documents recupereDocuments(int index) {
			if(index>=0 && index<doc.size())
				return(doc.get(index));
			throw new IllegalArgumentException("l'indice doit etre eompris entre 0 est la taille du liste");	
			}
		
		public boolean supprimerDocuments(Documents d) {
			return doc.remove(d);	
		}
		
		
		public boolean rechercheDocuments(Documents d)
		{
			return doc.contains(d);
			
		}
		
		public void trieDocument(Comparator<Documents> cmp)//trie d'une manier generele
		{
			Collections.sort( doc,cmp);
		}
		
		public ArrayList<Documents> copierList(){
			ArrayList<Documents> newlist = new ArrayList<Documents>();
			newlist.addAll(doc);
			return newlist;
		}
		
		public void melangerList() {
			Collections.shuffle(doc);
		}
		
		public void inverserList() {
			Collections.reverse(doc);
		}
		
		public ArrayList<Documents> subListe(int start,int end){
			if(start >=0 && end<doc.size())
					return new ArrayList<Documents>( doc.subList(start, end));
			throw new IllegalAccessError("un probleme dans start ou end");
		}
		
		public boolean compareList(ArrayList<Documents> list) {
			return doc.equals(list);
			//true meme nature meme taille les deux sont deux a deux (contenu)egaux
		}
		
		public void echnagerList(int p1,int p2) {
			Collections.swap(doc, p1, p2);
		}
		
		public void viderList() {
			doc.clear();
		}
		
		public boolean listEstVide() {
			return doc.isEmpty();
		}
		  
				
}
