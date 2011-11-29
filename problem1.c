/**
   Euler problem number 1
*/

#include <stdlib.h>
#include <stdio.h>

#define MAX 1000

int to_sum[MAX];

int is_multiple_of(int num) {
    return ((num % 3 == 0) || (num % 5 == 0));
}

void fill_to_sum(int size) {
    to_sum[size] = size;
    if (size == 0) {
        return;
    } else {
        fill_to_sum(size-1);
    }
}

int filter_on_multiples(int size, int *list, int totsum) {
    if (size == 0)
        return totsum;

    int sub_sum = filter_on_multiples(size-1, list, totsum);
    if (is_multiple_of(list[size]))
        return list[size] + sub_sum;
    else
        return sub_sum;
}

int main(int argc, char *argv[])
{
    fill_to_sum(1000);
    printf("result = %d\n", filter_on_multiples(MAX-1, to_sum, 0));
    return 0;
}

/* Local Variables: */
/* compile-command: "gcc problem1.c -o problem1" */
/* End: */
