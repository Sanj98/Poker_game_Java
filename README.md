## Poker Game implemented in Java

#### This project consists of two files Poker.java and Player.java. 

The aim of this project is to correctly characterise a poker hand according to the list of classifications that Poker game includes.
These classifications could be Straight flush, Four of a kind, Three of a kind, Full house etc. It takes a poker hand as input via command line argument and returns the description of the classification it belongs to. 

Cards should be entered on the command line as two-character strings, the ﬁrst being an A for Ace, K for King, Q for Queen, J for Jack, T for Ten, or digit between 2 and 9 for ranks 2–9. The second character should be a C for Clubs (♣), D for Diamonds (♦), H for Hearts (♥), or S for Spades (♠). The program handles both upper and lower case characters (or even a mixture). 

The description of hand gives both the hand category and some indication of how to decide ties using standard Poker lingo as follows:

Straight ﬂush      r-high straight flush        r is highest rank in hand

Four of a kind     Four rs                      r is rank of 4 cards

Full house         r1s full of r2s              r1 is rank of 3 cards; r2 is rank of 2

Flush              r-high flush                 r is highest rank in hand 

Straight           r-high straight              r is highest rank in hand

Three of a kind    Three rs                     r is rank of 3 cards

Two pair           r1s over r2s                 r1 is rank of higher pair; r2 is rank of lower pair

One pair           Pair of rs                   r is rank of pair 

High card          r-high                       r is highest rank in hand

For example,

java Poker 2H TH AS AD TC should produce 

Player 1: Aces over 10s

The project also handles some input arguments that may not be appropriate for the game. They are as follows - 

1. No more than 5 arguments must be supplied, if not then the program returns NOT_UNDERTAKEN and exits.

2. The arguments must be greater than 0 or a multiple of 5, if not then the program returns Error: wrong number of arguments; must be a multiple of 5.

3. Arguments must be a valid card, if not then the program returns Error: invalid card name ’c’ where c is the (ﬁrst) invalid card entered on the command line.

** What each class does has been mentioned in the beginning of the program.





