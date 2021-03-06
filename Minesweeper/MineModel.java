import javax.swing.JOptionPane;
class MineModel {

  MineViewer viewer;
  public static final int CUSTOM = 0;
  private int customXGrid = 0; //may need later
  private int customYGrid = 0; //may need later
  private int customMineCount = 0;

  public static final int EASY = 1;
  private final int easyGridSize = 8;
  private final int easyMineCount = 10;

  public static final int MEDIUM = 2;
  private final int medGridSize = 16;
  private final int medMineCount = 40;

  public static final int HARD = 3;
  private final int hardGridSize = 24;
  private final int hardMineCount = 99;

  private int gameMode = 0;
  private int mineCount = 0;
  private char[][] mineField;
  private char[][] playField;

  public MineModel() {
  }
  public MineModel(int[] customSettings) { //for custom game selection
    customMineCount = customSettings[2];
    mineField = new char[customSettings[0]][customSettings[1]];
    playField = new char[customSettings[0]][customSettings[1]];
  }
  public MineModel(int gameMode) { //preset mode selection
    this.gameMode = gameMode;
    switch (gameMode) {
      case EASY:
        mineField = new char[easyGridSize][easyGridSize];
        playField = new char[easyGridSize][easyGridSize];
        mineCount = easyMineCount;
        break;
      case MEDIUM:
        mineField = new char[medGridSize][medGridSize];
        playField = new char[medGridSize][medGridSize];
        mineCount = medMineCount;
        break;
      case HARD:
        mineField = new char[hardGridSize][hardGridSize];
        playField = new char[hardGridSize][hardGridSize];
        mineCount = hardMineCount;
        break;
      case CUSTOM:
        System.out.println("ERROR");
        break;
    }
  }

  //getter methods
  public int getRows() {
    return playField.length;
  }
  public int getColumns() {
    return playField[0].length;
  }
  public void setMine(int mineCount, int height, int width){
    int x;
    int y;
     x = (int)(Math.random()*height);
     y = (int)(Math.random()*width);

     if(mineField[x][y] != 'M'){
       mineField[x][y] = 'M';
     }
     else{setMine(mineCount,getRows(),getColumns());}

  }
  public void setFlag(int x, int y) {
  //  playField[x][y] = 'F';
  }
  public void mineCheck(int x, int y) {
    //if (mineField[x][y]=='M') {

    //}
  }
  public double[][] getMineField(){
    return mineField;
  }

}
