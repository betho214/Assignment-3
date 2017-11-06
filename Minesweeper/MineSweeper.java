import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class MineSweeper{

  //constants
  static final int width = 8;
  static final int height = 8;
  static final int mineNum = 8;
  static char mineCount = '0';
  int x =0;
  int y =0;
  char click = 'P';
  int xValue = 0;
  int yValue = 0;

  Scanner scan = new Scanner(System.in);
  static char[][] mineGrid = new char[width][height];
  static char[][] visibleGrid = new char[width][height];

  //constructor
  MineSweeper(){

    createVisibleBoard();
    createBoard();

      //calls the method addMine 8 times to create 8 mines and replace the X's with M's
    for(int k=0; k< mineNum; k++) {
      addMine();
      mineCounter();
    }

    userClicks();
  }

  //Methods

    //creates original mine grid and sets all spaces to X
  public void createBoard(){
    for(int i=0; i< mineGrid.length; i++){
      for(int j=0; j< mineGrid[i].length; j++){
        mineGrid[i][j] = mineCount;
      }
    }
  }

    //Adds Mines to random locations
  public void addMine(){
    this.y =  (int)(Math.random()*height);
    this.x =  (int)(Math.random()*width);

    if(mineGrid[y][x] != 'M'){
      mineGrid[y][x] = 'M';
    }
    else{addMine();}
  }

    //Adds 1 to every space touched by a Mine
  public void mineCounter(){
    try {if(mineGrid[y-1][x] != 'M')   {mineGrid[y-1][x]++;}}
    catch(IndexOutOfBoundsException e){}
    try {if(mineGrid[y][x+1] != 'M')   {mineGrid[y][x+1]++;}}
    catch(IndexOutOfBoundsException e){}
    try {if(mineGrid[y+1][x] != 'M')   {mineGrid[y+1][x]++;}}
    catch(IndexOutOfBoundsException e){}
    try {if(mineGrid[y][x-1] != 'M')   {mineGrid[y][x-1]++;}}
    catch(IndexOutOfBoundsException e){}
    try {if(mineGrid[y-1][x-1] != 'M') {mineGrid[y-1][x-1]++;}}
    catch(IndexOutOfBoundsException e){}
    try {if(mineGrid[y-1][x+1] != 'M') {mineGrid[y-1][x+1]++;}}
    catch(IndexOutOfBoundsException e){}
    try {if(mineGrid[y+1][x-1] != 'M') {mineGrid[y+1][x-1]++;}}
    catch(IndexOutOfBoundsException e){}
    try {if(mineGrid[y+1][x+1] != 'M') {mineGrid[y+1][x+1]++;}}
    catch(IndexOutOfBoundsException e){}
  }

    //creates the board visible to the player
  public void createVisibleBoard(){
    for(int i=0; i< visibleGrid.length; i++){
      for(int j=0; j< visibleGrid[i].length; j++){
        visibleGrid[i][j] = 'U';
        System.out.print(visibleGrid[i][j]+ " ");
      }
      System.out.println();
    }
    System.out.println();
  }

    //updates the board with the new user clicks
  public void updateBoard(){
    for(int i=0; i< visibleGrid.length; i++){
      for(int j=0; j< visibleGrid[i].length; j++){
        System.out.print(visibleGrid[i][j]+ " ");
      }
      System.out.println();
    }
    System.out.println();
  }

    //prints the hidden board if player gets game over
  public void printHiddenBoard(){
    for(int i=0; i< mineGrid.length; i++){
      for(int j=0; j< mineGrid[i].length; j++){
        System.out.print(mineGrid[i][j]+ " ");
      }
      System.out.println();
    }
  }

  public void leftClickZero(int x, int y){
    try {
      if(mineGrid[y-1][x] == '0'){}
    }
    catch(IndexOutOfBoundsException e){}
    try {if(mineGrid[y][x+1] != 'M')   {mineGrid[y][x+1]++;}}
    catch(IndexOutOfBoundsException e){}
    try {if(mineGrid[y+1][x] != 'M')   {mineGrid[y+1][x]++;}}
    catch(IndexOutOfBoundsException e){}
    try {if(mineGrid[y][x-1] != 'M')   {mineGrid[y][x-1]++;}}
    catch(IndexOutOfBoundsException e){}
    try {if(mineGrid[y-1][x-1] != 'M') {mineGrid[y-1][x-1]++;}}
    catch(IndexOutOfBoundsException e){}
    try {if(mineGrid[y-1][x+1] != 'M') {mineGrid[y-1][x+1]++;}}
    catch(IndexOutOfBoundsException e){}
    try {if(mineGrid[y+1][x-1] != 'M') {mineGrid[y+1][x-1]++;}}
    catch(IndexOutOfBoundsException e){}
    try {if(mineGrid[y+1][x+1] != 'M') {mineGrid[y+1][x+1]++;}}
    catch(IndexOutOfBoundsException e){}
  }

    //checks for user clicks and acts appropiatly
  public void userClicks(char c, int x, int y){

    if( c == 'R'){
        if(visibleGrid[y][x] != 'F'){
          visibleGrid[y][x] = 'F'
          updateBoard();
        }
        else if(visibleGrid[y][x == 'F']){
          visibleGrid[y][x] = 'U'
          updateBoard();
        }
    }

    else if( c == 'L'){
        if(mineGrid[y][x] == '0'){
          leftClickZero(x, y);
        }
        else if(mineGrid == 'M'){

        }
        else{
          visibleGrid[y][x] = mineGrid[y][x];
          updateBoard();
        }
    }
  }

//Main
public static void main(String[] args) {

  MineSweeper name = new MineSweeper();

    //Creates and prints the new grid
    for(int i=0; i< mineGrid.length; i++){
      for(int j=0; j< mineGrid[i].length; j++){
        System.out.print(mineGrid[i][j]+ " ");
      }
      System.out.println();
    }

  }
}
