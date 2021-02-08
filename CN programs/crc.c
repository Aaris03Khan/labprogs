#include<stdio.h>

#include<string.h>

void main() {
  int i, j, keylen, msglen;
  char input[20], key[10], key1[10], temp[10], rem[10], quo[10];
  printf("enter the input:");
  gets(input);
  printf("enter the divisor:");
  gets(key);
  keylen = strlen(key);
  msglen = strlen(input);
  for (i = 0; i < keylen - 1; i++) {
    input[msglen + i] = '0';
  }
  strcpy(key1, key);
  for (i = 0; i < keylen; i++) {
    temp[i] = input[i];
  }
  for (i = 0; i < msglen; i++) {
    quo[i] = temp[0];
    if (quo[i] == '0') {
      for (j - 0; j < keylen; j++) {
        key[j] = '0';
      }
    } else {
      for (j = 0; j < keylen; j++) {
        key[j] = key1[j];
      }
    }
    for (j = keylen - 1; j > 0; j--) {
      if (temp[j] == key[j]) {
        rem[j - 1] = '0';
      } else {
        rem[j - 1] = '1';
      }
    }
    rem[keylen - 1] = input[keylen + i];
    strcpy(temp, rem);
  }
  strcpy(rem, temp);
  printf("quotient is:");
  for (i = 0; i < msglen; i++)
    printf("%c", quo[i]);
  printf("\nrem is:");
  for (i = 0; i < keylen - 1; i++)
    printf("%c", rem[i]);
  printf("\nthe final data is :");
  for (i = 0; i < msglen; i++)
    printf("%c", input[i]);
  for (i = 0; i < keylen - 1; i++)
    printf("%c", rem[i]);
}

// OUTPUT:
// enter the input:1011010110101
// enter the divisor:1001
// quotient is:1010000110011
// rem is:011
// the final data is :1011010110101011