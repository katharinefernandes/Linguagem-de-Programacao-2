//Data de Última alteração: 02/06/2021
//Aluna: Katharine Fernandes Viana Rodrigues 
//Prontuário: SP302718X
//Turma: 331 - B

package lista1;

public class Jogador {
  
    private String nome;
    private Integer idade;
    private String email;

    public Jogador () {
      this.nome = "";
      this.idade = 0;
      this.email = "";
    }

    public Jogador( String nome, Integer idade, String email ) {
    this.nome = nome;
    this.idade = idade;
    this.email = email;
    }

    public String getNome () {
    return nome;
    }

    public void setNome (String nome) {
    this.nome = nome;
    }

    public Integer getIdade () {
    return idade;
    }

    public void setIdade (Integer idade) {
    this.idade = idade;
    }

    public String getEmail() {
    return email;
    }

    public void setEmail(String email) {
    this.email = email;
    }

    public String toString () {
    return "Jogador [nome=" + nome + ", idade=" + idade + ", email=" + email + "]";
    }
    
  	//Método Equals  
  	public boolean equals (Object obj) {
      
      if (this == obj)
      return true;
      
      if (obj == null)
      return false;
      
      if (getClass () != obj.getClass())
      return false;
      
      Jogador other = (Jogador) obj;
      
      if (email == null) {
      	if (other.email != null)
      		return false;
      } else if (!email.equals(other.email))
      		return false;
      if (idade == null) {
      	if (other.idade != null)
      		return false;
      } else if (!idade.equals(other.idade))
      		return false;
      if (nome == null) {
      	if (other.nome != null)
      		return false;
      } else if (!nome.equals(other.nome))
      		return false;
      return true;
    }
	
  	//Método HashCode  
    public int hashCode () {
      
      final int prime = 31;
      int result = 1;

      result = prime * result + ((email == null) ? 0 : email.hashCode ());
      result = prime * result + ((idade == null) ? 0 : idade.hashCode ());
      result = prime * result + ((nome == null) ? 0 : nome.hashCode ());

      return result;
    }

}public class Jogador {
  
}
