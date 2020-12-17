#include <stdio.h>
#include <sys/types.h> 			
#include <fcntl.h>
#include <unistd.h> 
#include <stdlib.h> 

#define NUM 1024000
#define RWX 0777

int main(int argc, char *argv[])
{
	int out_fd, x;
	char buffer[NUM]; 
	char* fileName = argv[1];				

	out_fd = open(fileName, O_RDWR | O_CREAT, RWX); 	/*open file and r/w/x change bits*/
	if (out_fd < 0) exit(1); 			/*test if out_fd bytes is generated correctly*/

	for(int i = 0; i < NUM; i++){
		buffer[i] = i;					/*fill buffer with values up to 1024000*/
	}
	
	x = write(out_fd, buffer, NUM); 	/*write to generated file */
	if (x <= 0) exit(2); 				/*test if x bytes is generated correctly*/
	
	close(out_fd); 						/*exit file*/
	
	return 0;
}
