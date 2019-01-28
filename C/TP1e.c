#include <stdio.h>

int incr(int t[8])
{
  int i;
  for(i = 0 ; i < 8; i=i+1){
    if(t[i] == 0){
      t[i] = 1;
      return 0;
    }
    else if(t[i] == 1){
      t[i] = 0;
    }
  }
  return -1;
}

int main(void)
{
  int idx;
  int t[8];
  int temp;
  int resultat;
  int res;
  for(idx = 0 ; idx<256 ; idx ++){
    temp = idx;
    for(int cpt = 0 ; cpt < 8; cpt ++){
      t[cpt] = (temp % 2);
      temp = (temp/2);
    }
    printf("Initiale: ");
    for(int cpt = 0 ; cpt < 8; cpt ++){
      printf("%d",t[cpt]);
    }
    if(incr(t) == 0){
      res = 1;
    } else { res = 0;
    resultat = t[0] * 1 + t[1] * 2 + t[2] * 4 + t[3] * 8 + t[4] * 16 + t[5] * 32 + t[6] * 64 + t[7] * 128;
    if (resultat == (idx + res)){
      res = 0;
    } else { res = -1; }
    printf(", Calculée: %d",resultat);
    for(int cpt = 0 ; cpt < 8; cpt ++){
      printf("%d",t[cpt]);
    }
    printf(" res : (%d), Diagnostic :",res);
    if(res == 0){
      printf("Calcul correct");
    } else if(res == -1 && idx != 255){
      printf("La fonction ne marche pas");
	} else {
      printf("Débordement correctement détecté");
    }
    temp = 0;
    printf("\n");
    
  }
}
