package dio.springboot;

public class ViaCepResponse {

	private String cep;
	
	private String lougradouro;
	
	private String localidade;

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLougradouro() {
		return lougradouro;
	}

	public void setLougradouro(String lougradouro) {
		this.lougradouro = lougradouro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	@Override
	public String toString() {
		return "ViaCepResponse [cep=" + cep + ", lougradouro=" + lougradouro + ", localidade=" + localidade + "]";
	}
	
}

