public class VerificadorNumeros {
    
    public  void  verificaNumeros(int num1, int num2) throws ParametroInvalidoException {
        if (num1 > num2) {
            throw new ParametroInvalidoException("O Primeiro numero deve ser menor que o segundo numero! ");
        }
    }
    
}
