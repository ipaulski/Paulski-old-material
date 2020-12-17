#include <stdio.h>
#include <sys/types.h> 			
#include <fcntl.h>
#include <unistd.h> 
#include <stdlib.h> 

#define NUM 1024000
#define RWX 0777

int main(int argc, char *argv[])
{
	int out_fd, x, ret;
	char buffer[NUM]; 
	char* fileName = argv[1];

	out_fd = open(fileName, O_RDWR | O_CREAT, RWX); 
	if (out_fd < 0) exit(1); 

	for(int i = 0; i < NUM; i++){
		buffer[i] = i;
	}
	
	x = write(out_fd, buffer, NUM); 
	if (x <= 0) exit(2); 

	close(out_fd); 

	ret = remove(fileName);
	
	return 0;
}
