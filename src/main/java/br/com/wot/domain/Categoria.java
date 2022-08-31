package br.com.wot.domain;

<<<<<<< HEAD

=======
>>>>>>> a192ef30014993b332eff685429e7cf416ba064e
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

<<<<<<< HEAD

@Entity
public class Categoria {	
	
	
	
=======
@Entity
public class Categoria {
	
>>>>>>> a192ef30014993b332eff685429e7cf416ba064e
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
<<<<<<< HEAD
	private List<Produto> produtos = new ArrayList<>();
	
	
	public Categoria() {
		
	}

	
=======
	@ManyToMany(mappedBy = "categorias")
	private List <Produto> produtos = new ArrayList<>();
	
	
	public Categoria () {
		
	}

>>>>>>> a192ef30014993b332eff685429e7cf416ba064e
	public Categoria(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

<<<<<<< HEAD

=======
>>>>>>> a192ef30014993b332eff685429e7cf416ba064e
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
<<<<<<< HEAD
=======
	}

	public void setNome(String nome) {
		this.nome = nome;
>>>>>>> a192ef30014993b332eff685429e7cf416ba064e
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
<<<<<<< HEAD

=======
	
>>>>>>> a192ef30014993b332eff685429e7cf416ba064e
	public List<Produto> getProdutos() {
		return produtos;
	}

<<<<<<< HEAD

=======
>>>>>>> a192ef30014993b332eff685429e7cf416ba064e
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

<<<<<<< HEAD

=======
>>>>>>> a192ef30014993b332eff685429e7cf416ba064e
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id);
	}
<<<<<<< HEAD
=======
	
	
	
>>>>>>> a192ef30014993b332eff685429e7cf416ba064e
	
}//end class








