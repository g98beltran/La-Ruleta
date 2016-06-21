import javax.swing.JOptionPane;

public class UI {
	public static final int NO_ICON = JOptionPane.PLAIN_MESSAGE;
	public static final int ALERT = JOptionPane.WARNING_MESSAGE;
	public static final int ERROR = JOptionPane.ERROR_MESSAGE;
	public static final int INFO = JOptionPane.INFORMATION_MESSAGE;
	public static final int QUERY = JOptionPane.QUESTION_MESSAGE;

	//vols arreplegar un int
	public static int integer(String message){
		return Integer.parseInt(message);
		
	}
	public static int inputInteger(String message){
		return Integer.parseInt(JOptionPane.showInputDialog(null, message));
	}
	//Ficar un missatge per la finestra
	public static void show(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	//missatge + titul sense icono
	public static void show(String message, String title) {
		JOptionPane.showMessageDialog(null, message, title, NO_ICON);
	}
	//missatge + titul + icono
	public static void show(String message, String title, int icon) {
		JOptionPane.showMessageDialog(null, message, title, icon);
	}
	//finestra amb missatge + si no cancelar
	public static int confirm(String message) {
		return JOptionPane.showConfirmDialog(null, message);
	}
	//Finestra amb missatge + titul +  si no cancelar
	public static int confirm(String message, String title) {
		return JOptionPane.showConfirmDialog(null, message, title, JOptionPane.PLAIN_MESSAGE);
	}
	//Finestra amb missatge + titul + icono + si no cancelar
	public static int confirm(String message, String title, int icon) {
		return JOptionPane.showConfirmDialog(null, message, title, icon);
	}
	//Espera un string
	public static String input(String message) {
		return JOptionPane.showInputDialog(null, message);
	}
	//Espera un string amb missatge + titol
	public static String input(String message, String title) {
		return JOptionPane.showInputDialog(null, message, title, JOptionPane.PLAIN_MESSAGE);
	}
	//ESpera unstring missatge + titol + icono
	public static String input(String message, String title, int icon) {
		return JOptionPane.showInputDialog(null, message, title, icon);
	}
	//Finestra de error per la excepció ix de la app quan la lies
	public static void error(String message, Exception e) {
		JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
		System.err.println(e.getMessage());
		System.exit(0);
	}
	//Finestra de error per la exccepció no ix de la app
	public static void errorNE(String message, Exception e) {
		JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
		System.err.println(e.getMessage());

	}
	//Error + titol
	public static void error(String message, String title, Exception e) {
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
		System.err.println(e.getMessage());
		System.exit(0);
	}
	//Error que no ix + titol
	public static void errorNE(String message, String title, Exception e) {
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
		System.err.println(e.getMessage());
	}

	//Aques es per ficarte botons per a triar opcions
	public static int option(String message, String title, String[] options) {
		return JOptionPane.showOptionDialog(null, message, title, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
				null, options, options[0]);
	}
	//ficarte botons per a triar opcions miss + titol + icono + array
	public static int option(String message, String title, int icon, String[] options) {
		return JOptionPane.showOptionDialog(null, message, title, JOptionPane.DEFAULT_OPTION, icon, null, options,
				options[0]);
	}
}
