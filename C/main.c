#include <stdio.h>

int incr(int t[8]){

  for(int i = 0; i < 8; i++){
    if(t[i] == 0){
      t[i] = 1;
      return 0;
    }

    else{
      t[i] = 0;
    }
  }

  return 1;
}


int main(void){
  int t[8];
  int nb;
  int reste;
  int retour;
  int dec;

  for(int i = 0; i < 8; i++){
    t[i] = 0;
  }
  
  for(int i = 0; i <= 255; i++){
    nb = i;
    for(int j = 0; j < 8; j++){
      reste = nb % 2;
      nb = nb / 2;
      t[j] = reste;
    }
    printf("Initiale:\t%d : %d%d%d%d%d%d%d%d, ", i, t[7],t[6],t[5],t[4],t[3],t[2],t[1],t[0]);

    retour = incr(t);

    dec = t[0] * 1 + t[1] * 2 + t[2] * 4 + t[3] * 8 + t[4] * 16 + t[5] * 32 + t[6] * 64 + t[7] * 128;

    printf("Calculée: %d :%d%d%d%d%d%d%d%d res : (%d), ", dec, t[7],t[6],t[5],t[4],t[3],t[2],t[1],t[0], retour);

    if(dec == i + 1 && retour == 0){
      printf("Diagnostic: Calcul correct\n");
    }

    else if(dec != i + 1 && retour == 1){
      printf("Diagnostic: Débordement correctement détecté\n");
    }

    else printf("Diagnostic: Calcul incorrect");
  }
  
}
