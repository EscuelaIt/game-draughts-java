package usantatecla.draughts.models;

// import usantatecla.draughts.types.Color;
// import usantatecla.draughts.types.Coordinate;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.regex.Pattern;

// public class GameBuilder {

//     private Color color;
//     private List<String> strings;

//     public GameBuilder() {
//         this.color = null;
//         this.strings = new ArrayList<String>();
//     }

//     public GameBuilder color(Color color){
//         this.color = color;
//         return this;
//     }

//     public GameBuilder rows(String... strings) {
//         for (String string : strings) {
//             assert Pattern.matches("[bBnN ]{8}", string);
//             this.strings.add(string);
//         }
//         return this;
//     }

//     public Game build() {
//         Game game = new Game();
//         assert this.strings.size() == Coordinate.DIMENSION;
//         for (int i = 0; i < this.strings.size(); i++) {
//             for(int j = 0; j < this.strings.get(i).length(); j++){
//                 game.putPiece()
//             }
//         }
//         return game;
//     }

//     private Color getColor(char character) {
//         switch (character) {
//         case 'b':
//         case 'B':
//             return Color.WHITE;
//         case 'n':
//         case 'N':
//             return Color.BLACK;
//         default:
//             return null;
//         }
//     }

// }

