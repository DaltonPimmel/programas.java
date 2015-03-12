class login{
	String usuario = "teste";  // ex: informações gravadas em banco.
	String sen = "12345";
	
	public boolean Verifica(String usu, String senha){
		if(usuario.equals(usu) && sen.equals (senha)){
			return true;  // no retorno poderia retornar uma chave primaria, ex: numero da conta. onde ira utilizar para buscar as outras informações como saldo, saque etc.
		}else{
			return false;
		}
	}
}
