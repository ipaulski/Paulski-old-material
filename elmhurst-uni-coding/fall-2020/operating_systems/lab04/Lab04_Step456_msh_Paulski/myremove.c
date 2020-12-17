#include <stdio.h>
#include <sys/types.h> 			
#include <fcntl.h>
#include <unistd.h> 
#include <stdlib.h> 

int main(int argc, const char *argv[])
{
	char* fileName = argv[1];
	
	if( access(fileName, F_OK ) == 0 ) {
	    // file exists
		unlink(fileName);
	} else {
	    // file doesn't exist
		exit(1);
	}
	
	return 0;
}
