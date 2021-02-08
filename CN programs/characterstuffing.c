#include<stdio.h>
#include<conio.h>
#include<string.h>

void main() {
  int i, j, count = 0, l, p;
  char a[30], b[4] = "DLE";
  printf("enter the data frame :");
  scanf("%s", a);
  l = strlen(a);
  printf("DLESTX");
  for (i = 0; i < l; i++) {
    count = 0;
    p = i;
    for (j = 0; j < 3; j++) {
      if (a[i] == b[j]) {
        count = count + 1;
        i++;
      }
    }
    if (count != 3) {
      i = p;
    }
    if (count == 3) {
      printf("DLEDLE");
    } else {
      printf("%c", a[i]);
    }
  }
  printf("DLEETX");
}

// output
// enter the data frame :hello
// DLESTXhelloDLEETX
