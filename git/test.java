package git;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.Comparator;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableauDesDocuments tableaudoc = new TableauDesDocuments();
		
		//Afficher le tableau
		System.out.println("----Afficher le tableau de documents-----");
		tableaudoc.afficher();
		System.out.println("\n");
		
		//Trier le tableau
		System.out.println("-----Trier le tableau-----");
		tableaudoc.trier();
		
		
		//affichage apres le tri
		System.out.println("-----Affichage apres le tri -----");
		tableaudoc.afficher();
		System.out.println("\n");
		
		//Ajoute un nouveau documents 
		System.out.println("----Ajoute un nv doc-----");
		Documents nouveauDoc = new Documents("HISTOIRE", "PDF", "A300");
		tableaudoc.ajouter(nouveauDoc);
		tableaudoc.afficher();
		System.out.println("\n");
		

        // Tester l'existence d'un document dans le tableau
		System.out.println("-----Tester l'existence d'un document dans le tableau-----");
        System.out.println("l'existence du document ajouté : " + tableaudoc.tester(nouveauDoc));
        System.out.println("\n");
        
		//Supprimer un documents
        System.out.println("-----Supprimer un doc-----");
        tableaudoc.supprimer(nouveauDoc);
  
        
        //Affichage apres la supression
        System.out.println("-----Affichage apres la supression------");
        tableaudoc.afficher();
        System.out.println("\n");
        
        // Compter le nombre de documents dans le tableau
        System.out.println("-------compte le nbre de doc-------");
        System.out.println("\nNombre de documents dans le tableau : " + tableaudoc.compterNombre(nouveauDoc));
        System.out.println("\n");
        
        //inverser le tableau
        System.out.println("-----inverser le tableau------");
        tableaudoc.inverser();
        
        //affichage apre inversements
        System.out.println("----affichage apre inversements-----");
        tableaudoc.afficher();
        System.out.println("\n");
        
        //aficher le doc le plus grands
        System.out.println("------aficher le doc le plus grands-----");
        System.out.println("le doc le plus grands est "+ tableaudoc.DocumentsplusGrandeDocuments()+"\n");

        //tester egalite de deuc tableau 
        System.out.println("----tester egalite de deux tableau----");
     			/* Documents[]tableaudoc2 = new Documents[3];
      			 tableaudoc2[0]=new Documents("MATHEMATIQUE","PDF","A200");
    		     tableaudoc2[1]=new Documents("FRANCAIS","PDF","A50");
    		     tableaudoc2[2]=new Livre("ARABE","WORD","A400","ouail","10/01/2020");
		 		*/
        
        Documents[] tableaudoc2 = {new Documents("MATHEMATIQUE", "PDF", "A200"),
                					new Documents("FRANCAIS", "PDF", "A50"),
                					new Livre("ARABE", "WORD", "A400", "ouail", "10/01/2020")};
        System.out.println("Tester l'égalité de deux tableaux : " + tableaudoc.testerdeuxTableaux(tableaudoc2)+"\n");
        
        
        
        System.out.println("*****************Array list*********************");
        
        	ListeDesDocuments listdoc= new ListeDesDocuments();
        	
        	//alimenter la liste des documents
        	listdoc.alimenter();
        	
        	//aficher la liste
        	listdoc.afficher();
        	System.out.println("\n");
        	
        	//parcouririe la liste
        	System.out.println("parcouririe la liste");
        	listdoc.parcourir();
        	System.out.println("\n");
        	
        	
        	//ajout nv documents
        	System.out.print("ajoute nv doc");
            Documents nouveauDocu1 = new Documents("HISTOIRE", "PDF", "A300");
            listdoc.ajouter(nouveauDoc);
            
            // Afficher la liste après l'ajout
            System.out.println("Liste après ajout :");
            listdoc.afficher();
            System.err.println("\n");
            
            //recupere doc par indice
            System.out.println("recupere doc pat indice");
            System.out.println("doc a recupere est "+ listdoc.recupereDocuments(1));
            
            //spprimer doc
            System.out.println("supprimer un doc");
            listdoc.supprimerDocuments(nouveauDocu1);
            
            
         // Recherche d'un document dans la liste
            System.out.println("\nRecherche du document ajouté : " + listdoc.rechercheDocuments(nouveauDoc));
            
         //trier
            listdoc.trieDocument(Comparator.comparing(Documents::getTitre));
            
         // Afficher la liste après le tri
            System.out.println("\nListe après le tri :");
            listdoc.afficher();
            System.out.println("\n");
            
        	//copier list
            ArrayList<Documents>copielist=listdoc.copierList();
            System.out.println("Copie de la liste :");
            System.out.println(copielist);
            

            // Mélanger la liste
            listdoc.melangerList();
            System.out.println("\nListe mélangée :");
            listdoc.afficher();
            
            // Inverser la liste
            listdoc.inverserList();
            System.out.println("\nListe inversée :");
            listdoc.afficher();
            
            //obtenir sou list
            System.out.println("\nSous-liste ");
            ArrayList<Documents> souslist =listdoc.subListe(0,2 );
            System.out.println("\n"+souslist);
            
            // Comparer deux listes  
            System.out.println("\nComparer avec la copie de la liste : " + listdoc.compareList(souslist));
            
            // Échanger deux éléments de la liste
            listdoc.echnagerList(0, 1);
            System.out.println("\nListe après échange :");
            listdoc.afficher();
            
            // Vider la liste
            listdoc.viderList();
            System.out.println("La liste est vide : " + listdoc.listEstVide());
            
            
            
            
            
        
		 
		
		
		
		
	}

}
