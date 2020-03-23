/*This project implements the classification of A poker hand.
  A poker hand consists fives cards,which means five input args for this programme.
  Each card has two attributes,rank and suit.
  Rank,in ascending order,includes 2,3,4,5,6,7,8,9,T(10),J(Jack),Q(Queen),K(King),A(Ace).
  Suit consists of C(Clubs),D(Diamonds),H(Hearts),S(Spades).
  There are nine classifications for hands,in descending order to be:
  Straight flush,Four of a kind,Full house,Flush,Straight,Three of a kind,Two pair,One pair,High card.
  Poker.java mainly judges whether the input is valid and sorts the valid rank and suit.
*/
import java.util.Arrays;

public class Poker {

    public static void main(String[] args) {
        Poker input_copy=new Poker();
        input_copy.IsCorrectInput(args);
        input_copy.ArraySort(args);
    }

    /**
     * Determine if the input is a valid card by checking whether rank and suit are in desired range.
     * @param args:includes five args.Each one has two parts,rank and suit.
     */
    private void IsCorrectInput(String []args){
        final int A = 10;
        final int T = 29;
        final int J = 19;
        final int Q = 26;
        final int K = 20;
        final int C=12;
        final int D=13;
        final int H=17;
        final int S=28;

        if(args.length>5){
            System.out.println("NOT UNDERTAKEN");
            System.exit(1);
        }
        if((args.length%5)!=0||args.length==0){
            System.out.println("Error: wrong number of arguments; must be a multiple of 5");
            System.exit(1);
        }

        for (String arg : args) {
            int rank = Character.getNumericValue(arg.charAt(0));
            int suit = Character.getNumericValue(arg.charAt(1));
            switch (rank) {
                case A:
                case T:
                case J:
                case Q:
                case K:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    break;
                default:
                    System.out.printf("Error: invalid card name '%s'\n",arg);
                    System.exit(1);
            }
            switch (suit){
                case C:
                case D:
                case H:
                case S:
                    break;
                default:
                    System.out.printf("Error: invalid card name '%s'\n",arg);
                    System.exit(1);
            }
        }
    }

    /**
     * Divide a valid input(card) into two arrays(RankArray,SuitArray). And sort them separately.
     * @param args:includes five args.Each one has two parts,rank and suit.
     */
    private void ArraySort(String []args){
        int[] RankArray =new int[5];
        String[] SuitArray = new String[5];

        Player card_copy=new Player();

        for(int index=0;index<5;index++){
            String card=args[index];
            char[] ch=card.toCharArray();
            RankArray[index]=card_copy.RankDecoder(ch[0]);
            SuitArray[index]=String.valueOf(ch[1]).toUpperCase();
        }
        Arrays.sort(RankArray);
        Arrays.sort(SuitArray);

        new Player(RankArray, SuitArray);
    }


}
