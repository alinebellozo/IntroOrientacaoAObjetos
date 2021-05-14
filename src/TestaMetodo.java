
public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaDaAline = new Conta();
		contaDaAline.saldo = 100;
		contaDaAline.deposita(100);
		System.out.println(contaDaAline.saldo);
		
		boolean conseguiuRetirar = contaDaAline.saca(50);
		contaDaAline.saca(50);
		System.out.println(contaDaAline.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarina = new Conta();
		contaDaMarina.deposita(1000);
		contaDaMarina.transfere(500, contaDaAline);
		System.out.println(contaDaMarina.saldo);
		System.out.println(contaDaAline.saldo);
		
		// if (contaDaMarina.transfere(500, contaDaAline)) {
		// 		System.out.println("Transferido com sucesso!");
		// } else {
		//		System.out.println("Ops, faltou dinheiro!");
		// System.out.println(contaDaMarina.saldo);
		// System.out.println(contaDaAline.saldo);
	}
}
