package git;

import java.util.Objects;
											//interface on le generalise on premier  
public class Documents implements Cloneable, Comparable<Documents> {
		String titre,format;
		String id;
		public Documents(String titre, String format,String id) {
			super();
			this.titre = titre;
			this.format = format;
			this.id = id;
		}
		public String getTitre() {
			return titre;
		}
		public void setTitre(String titre) {
			this.titre = titre;
		}
		public String getFormat() {
			return format;
		}
		public void setFormat(String format) {
			this.format = format;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		@Override
		public String toString() {
			return this.getClass().getSimpleName()+" =titre=" + titre + ", format=" + format + ", id=" + id ;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Documents other = (Documents) obj;
			return Objects.equals(id, other.id);
		}
		
		@Override
		public Documents clone() {
			try {
			// TODO Auto-generated method stub
			return (Documents)super.clone();
			}
			catch(CloneNotSupportedException e) {
				return null;
			}
		}
		@Override
		public int compareTo(Documents o) {
			// TODO Auto-generated method stub
			return this.id.compareTo(o.id);
			
		}
		
		
		
}
