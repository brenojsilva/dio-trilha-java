import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public Banco(){
		this.contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public List<String> getNomesClientes(){
		List<String> nomes = new ArrayList<>();

		if (contas != null) {
        for (Conta conta : contas) {
            String nomeCliente = conta.getCliente().getNome();
            if (!nomes.contains(nomeCliente)) {
                nomes.add(nomeCliente);
            }
        }
    }

		return nomes;
	}

}