
public class Tablero {
    public static void main(String[] args){
        Tablero tablero = new Tablero();
        tablero.dibujarTablero();
    }

    public static final String SIMBOLO_VACIO = " ";

    private String[][] tablero;
    String wr = "\033[47;31m";
    String reset ="\033[0m";
    String nr = "\033[40;31m";
    String fw = "\033[47;37m";
    String fn = "\033[40;30m";
    String nw = "\033[40;37m";

    public Tablero() {
        this.tablero = new String[8][8];
        llenarTablero();
        pintartabla();
    }

    public String[][] getTablero() {
        return tablero;
    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }

    public void dibujarTablero() {
        System.out.println("\t___________________________________________________________________________________________________________________________________");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print("\t|");
            for (int j = 0; j < tablero.length; j++) {
                System.out.print("\t");
                System.out.print(wr+ tablero[i][j] + "\t" + reset);
                System.out.print("|");
            }
            System.out.println("");
            System.out.println("\t_________________________________________________________________________________________________________________________________");
        }
    }

    private void llenarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = SIMBOLO_VACIO;
            }

        }
    }
    public void pintartabla(){
		System.out.println(" H  G  F  E  D  C  B  A");//0
		System.out.println("8"+fw+" O "+nr+" O "+fw+" O "+nr+" O "+fw+" O "+nr+" O "+fw+" O "+nr+" O "+reset+"1");//1
		System.out.println("7"+nr+" O "+fw+" O "+nr+" O "+fw+" O "+nr+" O "+fw+" O "+nr+" O "+fw+" O "+reset+"2");//2
		System.out.println("6"+fw+" O "+fn+" O "+fw+" O "+fn+" O "+fw+" O "+fn+" O "+fw+" O "+fn+" O "+reset+"3");//3
		System.out.println("5"+fn+" O "+fw+" O "+fn+" O "+fw+" O "+fn+" O "+fw+" O "+fn+" O "+fw+" O "+reset+"4");//4
		System.out.println("4"+fw+" O "+fn+" O "+fw+" O "+fn+" O "+fw+" O "+fn+" O "+fw+" O "+fn+" O "+reset+"5");//5
		System.out.println("3"+fn+" O "+fw+" O "+fn+" O "+fw+" O "+fn+" O "+fw+" O "+fn+" O "+fw+" O "+reset+"6");//6
		System.out.println("2"+fw+" O "+nw+" O "+fw+" O "+nw+" O "+fw+" O "+nw+" O "+fw+" O "+nw+" O "+reset+"7");//7
		System.out.println("1"+nw+" O "+fw+" O "+nw+" O "+fw+" O "+nw+" O "+fw+" O "+nw+" O "+fw+" O "+reset+"8");//8
		System.out.println(" A  B  C  D  E  F  G  H");//fin

	}

    public boolean estaLlenoElTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j].equalsIgnoreCase(SIMBOLO_VACIO)) {
                    return false;
                }
            }
        }
        return true;
    }

}