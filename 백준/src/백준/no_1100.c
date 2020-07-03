#include<stdio.h>

void main() {
	char object;
	int count = 0;
	for (int i = 0; i < 8; i++) {
		for (int j = 0; j < 8; j++) {
			scanf_s(" %c", &object);
			if (i % 2 == 0 && object=='F') {
				if (j % 2 == 0) {
					count++;
				}
			}
			else {
				if (j % 2 == 1 && object == 'F') {
					count++;
				}
			}
		}
	}
	printf("%d\n", count);
}