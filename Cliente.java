public class Cliente {

	private static int ultimoID = 10_000;

    private String nome;
    private int documento;

    public Cliente (String nome) {

    	this.setNome(nome);
        ultimoID ++;
        this.documento = ultimoID;

    }

    public String getNome() {
    	return nome;
    }

    public void setNome(String nome) {

    	this.nome = nome;

    }

    @Override
    public String toString() {
    	
        StringBuilder sb = new StringBuilder();

        sb.append("Nome: " + nome + "\n");
        sb.append("Documento: " + documento);

        return sb.toString();

    }

    @Override
    public int hashCode(){
        return this.documento;
    }
}
