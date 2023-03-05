package Modele;

public class Grille {
    private char[][] plateau;
    private int nbLigne;
    private int nbColonne;

    public Grille() {
        plateau= new char [8][8];
        for (int i = 0;i<8;i++){
            for(int j=0; j<8;j++){
                plateau[i][j] = 0;
            }
        }
        plateau[3][3]=plateau[4][4]=1;
        plateau[3][4]=plateau[4][3]=2;
        nbLigne =8;
        nbColonne = 8;
    }
    @Override
   public String toString() {
        String res = "|_A_|_B_|_C_|_D_|_E_|_F_|_G_|_H_|\n";
        for (int i = 0;i<nbLigne;i++){
            res+= i + " |";
            for(int j=0; j<nbColonne;j++){
                switch (plateau[i][j]){
                    case '.':
                        res += "\uD83D\uDFE9";
                        break;
                    case 'O':
                        res +=  "\u26AA";
                        break;
                    case 'X':
                        res +=  "\u26AB";
                        break;
                }
            }
            res+="\n";
        }
        return res;
    }
}
