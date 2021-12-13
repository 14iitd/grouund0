//package com.abhishek;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class TicTac {
//     char [][] board= new char[3][3];
//    char player1='o';
//    char player2='x';
//    char currentPlayer='x';
//    boolean boardFilled=true;
//    void markOnBoard(char player, int i, int j){
//        if (player!=this.currentPlayer){
//            //do nothing
//        }else{
//            this.board[i][j]=player;
//        }
//
//    }
//    char calculateGame(){
//        if (this.board[0][0]!='\u0000' && this.board[0][0]==this.board[0][1] && this.board[0][0]==this.board[0][2]){
//                return this.board[0][0];
//        }
//        if (this.board[2][0]!='\u0000' && this.board[2][0]==this.board[2][1] && this.board[2][0]==this.board[2][2]){
//            return this.board[0][0];
//        }
//        if (this.board[1][0]!='\u0000' && this.board[1][0]==this.board[1][1] && this.board[1][0]==this.board[1][2]){
//            return this.board[0][0];
//        }
//        if (this.board[0][0]!='\u0000' && this.board[0][0]==this.board[1][0] && this.board[0][0]==this.board[2][0]){
//            return this.board[0][0];
//        }
//        if (this.board[0][1]!='\u0000' && this.board[0][1]==this.board[1][1] && this.board[0][1]==this.board[2][1]){
//            return this.board[0][1];
//        }
//        if (this.board[0][2]!='\u0000' && this.board[0][2]==this.board[1][2] && this.board[0][2]==this.board[2][2]){
//            return this.board[0][2];
//        }
//
//        if (this.board[0][0]!='\u0000' && this.board[0][0]==this.board[1][1] && this.board[0][0]==this.board[2][2]){
//            return this.board[0][0];
//        }
//        if (this.board[2][0]!='\u0000' && this.board[2][0]==this.board[1][1] && this.board[2][0]==this.board[0][2]){
//            return this.board[2][0];
//        }
//        return '1';
//    }
//    void printBoard(){
//        System.out.println(board[0][0]+"|"+board[0][1]+"|"+board[0][2]);
//        System.out.println(board[1][0]+"|"+board[1][1]+"|"+board[1][2]);
//        System.out.println(board[2][0]+"|"+board[2][1]+"|"+board[2][2]);
//    }
//    void gameStart(){
//        System.out.println("------starting tic tac game-----");
//        boolean gameOver=false;
//        while(!gameOver){
//            this.printBoard();
//            System.out.println("------current Player is -----"+ this.currentPlayer);
//        Scanner in=new Scanner(System.in);
//        int x=in.nextInt();
//        int y=in.nextInt();
//        this.markOnBoard(this.currentPlayer,x,y);
//        char status=this.calculateGame();
//        if (status=='1'){
//            this.currentPlayer=this.currentPlayer==player1?player2:player1;
//        }else{
//            System.out.println("------Player is -----"+ this.currentPlayer+"won");
//            gameOver=true;
//        }}
//    }
//
//    public static void main(String[] args){
//
//        TicTac game=new TicTac();
//        game.currentPlayer='x';
//        game.gameStart();
//        HashMap<int,int> valMap=new HashMapap<>();
//        for (Map.Entry<int,int> c:valMap.entrySet()
//             ) {c.
//
//        }
//
//    }
//}
