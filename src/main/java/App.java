/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public final class App {

    public String getGreeting() {
        return "*** Hello world. ***"; //★コンパイルに失敗するファイル
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
