public final class App {

	private void run() {
		System.out.println("[TRACE] ### START ###");
		System.out.println(this.getMessageString1());
		System.out.println("[TRACE] --- END ---");
	}
	
	public String getMessageString1() {
		return "コンニチハ！";
	}

	public static void main(String[] args) {
		new App().run();
	}
}
